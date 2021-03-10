package entity;

import thriftEntity.dcColumn;

public class RealColumn<T> {
    dcColumn columnInfo;
    T[] data;

    public void setColumnInfo(dcColumn columnInfo) {
        this.columnInfo = columnInfo;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public dcColumn getColumnInfo() {
        return columnInfo;
    }

    public T[] getData() {
        return data;
    }
}
