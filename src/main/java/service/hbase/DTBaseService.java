package service.hbase;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;
import thriftEntity.*;
import java.io.IOException;



public class DTBaseService {

    private static Logger logger = Logger.getLogger(DTBaseService.class);

    Connection conn = null;

    public DTBaseService() {
        Configuration conf = HBaseConfiguration.create(); // 会自动加载hbase-site.xml
        conf.set(HConstants.ZOOKEEPER_QUORUM,
                dcConfig.zookeepers);

        conf.set(HConstants.ZOOKEEPER_CLIENT_PORT, "2181");
        try {
            conn = ConnectionFactory.createConnection(conf);
        } catch (IOException e) {
            logger.error("连接到数据库失败,检查配置！");
            e.printStackTrace();
        }
    }

    /**
     * 根据表名获取Table对象
     *
     * @param tableName 表名
     * @return Table对象
     */
    private Table getTable(String tableName) {
        Table table = null;
        try {
            table = conn.getTable(TableName.valueOf(tableName));
        } catch (IOException e) {
            logger.error("获取表" + tableName + "失败,检查表名！");
            e.printStackTrace();
        }
        return table;
    }

    /**
     * 插入数据
     *
     * @param data 数据
     * @return 插入是否成功
     */
    public boolean insertData(Object data) {
        boolean r = false;
        if (data instanceof dcProduct) {
            r = insertDCProduct((dcProduct) data);
        } else if (data instanceof dcPDO) {
            r = insertPDO((dcPDO) data);
        }
        return r;
    }

    /**
     * 创建表
     * @param tbName 表名
     * @param families 列族数组
     * @return 插入是否成功
     */
//    private boolean createTable(String tbName,String[] families){
//        try {
//            Admin admin = conn.getAdmin();
//            TableName tableName = TableName.valueOf(tbName);
//            if(admin.tableExists(tableName)){
//                return true;
//            }
//            HTableDescriptor des = new HTableDescriptor(tableName);
//
//            for(String family:families){
//                des.addFamily(new HColumnDescriptor(family));
//            }
//
//            admin.createTable(des);
//            return true;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    /**
     * 插入dcProduct数据
     *
     * @param product
     * @return 插入是否成功
     */
    private boolean insertDCProduct(dcProduct product) {
        boolean insert = false;
        String tableName = product.isInterval ? dcProductConfig.PDR_TABLE_NAME : dcProductConfig.PDP_TABLE_NAME;//根据标志位获取表名
        Table table = getTable(tableName);
        String rowkey = product.getRowkey();
        Put put = new Put(Bytes.toBytes(rowkey));
        if (product.isSetStartTime()) {
            put.addColumn(Bytes.toBytes(dcProductConfig.DATA_COL_FAMILY), dcProductConfig.START_TIME, product.getStartTime().getBytes());
        }
        if (product.isSetEndTime()) {
            put.addColumn(Bytes.toBytes(dcProductConfig.DATA_COL_FAMILY), dcProductConfig.END_TIME, product.getEndTime().getBytes());
        }
        if (product.isSetDeviceName()) {
            put.addColumn(Bytes.toBytes(dcProductConfig.DATA_COL_FAMILY), dcProductConfig.DEVICE_NAME, product.getDeviceName().getBytes());
        }
        if (product.isSetMaterialName()) {
            put.addColumn(Bytes.toBytes(dcProductConfig.DATA_COL_FAMILY), dcProductConfig.MATERIAL_NAME, product.getMaterialName().getBytes());
        }
        if (product.isSetData()) {
            for (dcColumn column : product.getData()) {
                JSONObject map = new JSONObject(true);//关键要设置为true，否则乱序
                //这些字段固定json存储
                map.put(dcColumn._Fields.NAME.getFieldName(), column.getName());
                map.put(dcColumn._Fields.DESCRIP.getFieldName(), column.getDescrip());
                map.put(dcColumn._Fields.SAMPLE_PERIOD.getFieldName(), column.getSamplePeriod());
                map.put(dcColumn._Fields.TYPE.getFieldName(), column.getType().getValue());
//                map.put(dcColumn._Fields.TYPE.getFieldName(), column.getType());
                map.put(dcColumn._Fields.ADDRESS.getFieldName(), column.getAddress());

                put.addColumn(Bytes.toBytes(dcProductConfig.INFO_COL_FAMILY), Bytes.toBytes(column.getName()), Bytes.toBytes(map.toString()));
                put.addColumn(Bytes.toBytes(dcProductConfig.DATA_COL_FAMILY), Bytes.toBytes(column.getName()), column.getColDat());
            }
            try {
                table.put(put);
                insert = true;
            } catch (IOException e) {
                logger.error("插入dcProduct数据失败,rowkey = " + rowkey);
                e.printStackTrace();
            }
        } else {
            logger.error("接受到dcProduct数据包data为空,rowkey = " + rowkey);
        }

        return insert;
    }

    private boolean insertPDO(dcPDO pdo) {
        boolean insert = false;
        Table table = getTable(dcPDOConfig.PDO_TABLE_NAME);
        String rowkey = pdo.getRowkey();
        Put put = new Put(Bytes.toBytes(rowkey));
        if (pdo.isSetStartTime()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.START_TIME, Bytes.toBytes(pdo.getStartTime()));
        }
        if (pdo.isSetEndTime()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.END_TIME, Bytes.toBytes(pdo.getEndTime()));
        }
        if (pdo.isSetDeviceName()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.DEVICE_NAME, Bytes.toBytes(pdo.getDeviceName()));
        }
        if (pdo.isSetMaterialName()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.MATERIAL_NAME, Bytes.toBytes(pdo.getMaterialName()));
        }
        if (pdo.isSetGroup()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.GROUP, Bytes.toBytes(pdo.getGroup()));
        }
        if (pdo.isSetShfit()) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY), dcPDOConfig.SHIFT, Bytes.toBytes(pdo.getShfit()));
        }
        for (dcDetail detail : pdo.items) {
            put.addColumn(Bytes.toBytes(dcPDOConfig.COL_FAMILY),
                    Bytes.toBytes(StrUtil.join(dcPDOConfig.SPLIT, detail.getName(), detail.getUnit())),
                    Bytes.toBytes(detail.getValue()));
        }
        try {
            table.put(put);
            insert = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return insert;
    }
}
