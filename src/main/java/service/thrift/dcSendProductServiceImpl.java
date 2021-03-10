package service.thrift;


import cn.hutool.core.util.StrUtil;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import service.hbase.DTBaseService;
import thriftEntity.dcColumn;
import thriftEntity.dcPDO;
import thriftEntity.dcProduct;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class dcSendProductServiceImpl  implements  dcSendProductService.Iface  {
    private static Logger logger = Logger.getLogger(dcSendProductServiceImpl.class);

    private DTBaseService service;
    private AtomicInteger pdpCnt =new AtomicInteger(0);
    private int pdoCnt =0;
    //private static final boolean isWin = System.getProperty("os.name").toLowerCase().contains("win");
    private static final boolean isLinux = System.getProperty("os.name").toLowerCase().contains("linux");


    dcSendProductServiceImpl(){
        service = new DTBaseService();
    }

    @Override
    public byte sendProduct(dcProduct product) throws TException {
        String ROP =(product.isInterval?"PDR":"PDP")+"- rowkey:{} colsCount:{}  firstColDatSize:{} firstColName:{}";
        logger.info(StrUtil.format("insert: "+ROP,product.rowkey,product.data.size(),product.data.get(0).colDat.position(),product.data.get(0).getName()));
        return service.insertData(product)?(byte)0:1;
    }

    @Override
    public byte sendPDO(dcPDO pdo) throws TException {
        String s ="PDO - rowkey:{} itemsCount:{}";
        logger.info("insert: "+StrUtil.format(s,pdo.rowkey,pdo.items.size()));
        return service.insertData(pdo)?(byte)0:1;

    }

    @Override
    public List<dcPDO> getPDOByMaterialId(String materialId) throws TException {
        return null;
    }


    private byte[] decodeValue(ByteBuffer bytes) {
        int len = bytes.limit() - bytes.position();
        byte[] bytes1 = new byte[len];
        bytes.get(bytes1);
        return bytes1;
    }

}
