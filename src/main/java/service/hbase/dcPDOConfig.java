package service.hbase;

import org.apache.hadoop.hbase.util.Bytes;
import thriftEntity.dcPDO;

import java.util.HashSet;
import java.util.Set;

public class dcPDOConfig {

    //表名
    public static String PDO_TABLE_NAME = "PDO";//后续从xml中加载

    //名称和单位合并的分隔符
    public static String SPLIT = "-";

    //列族
    public static String COL_FAMILY = "data";

    //固定字段
    public static byte[] START_TIME = Bytes.toBytes(dcPDO._Fields.START_TIME.getFieldName());

    public static byte[] END_TIME = Bytes.toBytes(dcPDO._Fields.END_TIME.getFieldName());

    public static byte[] DEVICE_NAME = Bytes.toBytes(dcPDO._Fields.DEVICE_NAME.getFieldName());

    public static byte[] MATERIAL_NAME = Bytes.toBytes(dcPDO._Fields.MATERIAL_NAME.getFieldName());

    public static byte[] GROUP = Bytes.toBytes(dcPDO._Fields.GROUP.getFieldName());

    public static byte[] SHIFT = Bytes.toBytes(dcPDO._Fields.SHFIT.getFieldName());


    public static Set<String> PERMANENT_FILED_SET = new HashSet<>();

    static {
        PERMANENT_FILED_SET.add(dcPDO._Fields.START_TIME.getFieldName());
        PERMANENT_FILED_SET.add(dcPDO._Fields.END_TIME.getFieldName());
        PERMANENT_FILED_SET.add(dcPDO._Fields.DEVICE_NAME.getFieldName());
        PERMANENT_FILED_SET.add(dcPDO._Fields.MATERIAL_NAME.getFieldName());
        PERMANENT_FILED_SET.add(dcPDO._Fields.GROUP.getFieldName());
        PERMANENT_FILED_SET.add(dcPDO._Fields.SHFIT.getFieldName());
    }

}
