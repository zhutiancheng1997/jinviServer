package thriftEntity;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2020-12-17")
public class dcPDO implements org.apache.thrift.TBase<dcPDO, dcPDO._Fields>, java.io.Serializable, Cloneable, Comparable<dcPDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("dcPDO");

  private static final org.apache.thrift.protocol.TField ROWKEY_FIELD_DESC = new org.apache.thrift.protocol.TField("rowkey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MATERIAL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("materialName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SHFIT_FIELD_DESC = new org.apache.thrift.protocol.TField("shfit", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new dcPDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new dcPDOTupleSchemeFactory();

  public String rowkey; // required
  public String startTime; // required
  public String endTime; // required
  public String deviceName; // required
  public String materialName; // required
  public String group; // required
  public String shfit; // required
  public java.util.List<dcDetail> items; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROWKEY((short)1, "rowkey"),
    START_TIME((short)2, "startTime"),
    END_TIME((short)3, "endTime"),
    DEVICE_NAME((short)4, "deviceName"),
    MATERIAL_NAME((short)5, "materialName"),
    GROUP((short)6, "group"),
    SHFIT((short)7, "shfit"),
    ITEMS((short)8, "items");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROWKEY
          return ROWKEY;
        case 2: // START_TIME
          return START_TIME;
        case 3: // END_TIME
          return END_TIME;
        case 4: // DEVICE_NAME
          return DEVICE_NAME;
        case 5: // MATERIAL_NAME
          return MATERIAL_NAME;
        case 6: // GROUP
          return GROUP;
        case 7: // SHFIT
          return SHFIT;
        case 8: // ITEMS
          return ITEMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROWKEY, new org.apache.thrift.meta_data.FieldMetaData("rowkey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("deviceName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MATERIAL_NAME, new org.apache.thrift.meta_data.FieldMetaData("materialName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHFIT, new org.apache.thrift.meta_data.FieldMetaData("shfit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEMS, new org.apache.thrift.meta_data.FieldMetaData("items", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, dcDetail.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(dcPDO.class, metaDataMap);
  }

  public dcPDO() {
  }

  public dcPDO(
    String rowkey,
    String startTime,
    String endTime,
    String deviceName,
    String materialName,
    String group,
    String shfit,
    java.util.List<dcDetail> items)
  {
    this();
    this.rowkey = rowkey;
    this.startTime = startTime;
    this.endTime = endTime;
    this.deviceName = deviceName;
    this.materialName = materialName;
    this.group = group;
    this.shfit = shfit;
    this.items = items;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public dcPDO(dcPDO other) {
    if (other.isSetRowkey()) {
      this.rowkey = other.rowkey;
    }
    if (other.isSetStartTime()) {
      this.startTime = other.startTime;
    }
    if (other.isSetEndTime()) {
      this.endTime = other.endTime;
    }
    if (other.isSetDeviceName()) {
      this.deviceName = other.deviceName;
    }
    if (other.isSetMaterialName()) {
      this.materialName = other.materialName;
    }
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    if (other.isSetShfit()) {
      this.shfit = other.shfit;
    }
    if (other.isSetItems()) {
      java.util.List<dcDetail> __this__items = new java.util.ArrayList<dcDetail>(other.items.size());
      for (dcDetail other_element : other.items) {
        __this__items.add(new dcDetail(other_element));
      }
      this.items = __this__items;
    }
  }

  public dcPDO deepCopy() {
    return new dcPDO(this);
  }

  @Override
  public void clear() {
    this.rowkey = null;
    this.startTime = null;
    this.endTime = null;
    this.deviceName = null;
    this.materialName = null;
    this.group = null;
    this.shfit = null;
    this.items = null;
  }

  public String getRowkey() {
    return this.rowkey;
  }

  public dcPDO setRowkey(String rowkey) {
    this.rowkey = rowkey;
    return this;
  }

  public void unsetRowkey() {
    this.rowkey = null;
  }

  /** Returns true if field rowkey is set (has been assigned a value) and false otherwise */
  public boolean isSetRowkey() {
    return this.rowkey != null;
  }

  public void setRowkeyIsSet(boolean value) {
    if (!value) {
      this.rowkey = null;
    }
  }

  public String getStartTime() {
    return this.startTime;
  }

  public dcPDO setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public void unsetStartTime() {
    this.startTime = null;
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return this.startTime != null;
  }

  public void setStartTimeIsSet(boolean value) {
    if (!value) {
      this.startTime = null;
    }
  }

  public String getEndTime() {
    return this.endTime;
  }

  public dcPDO setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public void unsetEndTime() {
    this.endTime = null;
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return this.endTime != null;
  }

  public void setEndTimeIsSet(boolean value) {
    if (!value) {
      this.endTime = null;
    }
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public dcPDO setDeviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  public void unsetDeviceName() {
    this.deviceName = null;
  }

  /** Returns true if field deviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceName() {
    return this.deviceName != null;
  }

  public void setDeviceNameIsSet(boolean value) {
    if (!value) {
      this.deviceName = null;
    }
  }

  public String getMaterialName() {
    return this.materialName;
  }

  public dcPDO setMaterialName(String materialName) {
    this.materialName = materialName;
    return this;
  }

  public void unsetMaterialName() {
    this.materialName = null;
  }

  /** Returns true if field materialName is set (has been assigned a value) and false otherwise */
  public boolean isSetMaterialName() {
    return this.materialName != null;
  }

  public void setMaterialNameIsSet(boolean value) {
    if (!value) {
      this.materialName = null;
    }
  }

  public String getGroup() {
    return this.group;
  }

  public dcPDO setGroup(String group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  public String getShfit() {
    return this.shfit;
  }

  public dcPDO setShfit(String shfit) {
    this.shfit = shfit;
    return this;
  }

  public void unsetShfit() {
    this.shfit = null;
  }

  /** Returns true if field shfit is set (has been assigned a value) and false otherwise */
  public boolean isSetShfit() {
    return this.shfit != null;
  }

  public void setShfitIsSet(boolean value) {
    if (!value) {
      this.shfit = null;
    }
  }

  public int getItemsSize() {
    return (this.items == null) ? 0 : this.items.size();
  }

  public java.util.Iterator<dcDetail> getItemsIterator() {
    return (this.items == null) ? null : this.items.iterator();
  }

  public void addToItems(dcDetail elem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<dcDetail>();
    }
    this.items.add(elem);
  }

  public java.util.List<dcDetail> getItems() {
    return this.items;
  }

  public dcPDO setItems(java.util.List<dcDetail> items) {
    this.items = items;
    return this;
  }

  public void unsetItems() {
    this.items = null;
  }

  /** Returns true if field items is set (has been assigned a value) and false otherwise */
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean value) {
    if (!value) {
      this.items = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROWKEY:
      if (value == null) {
        unsetRowkey();
      } else {
        setRowkey((String)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((String)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((String)value);
      }
      break;

    case DEVICE_NAME:
      if (value == null) {
        unsetDeviceName();
      } else {
        setDeviceName((String)value);
      }
      break;

    case MATERIAL_NAME:
      if (value == null) {
        unsetMaterialName();
      } else {
        setMaterialName((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((String)value);
      }
      break;

    case SHFIT:
      if (value == null) {
        unsetShfit();
      } else {
        setShfit((String)value);
      }
      break;

    case ITEMS:
      if (value == null) {
        unsetItems();
      } else {
        setItems((java.util.List<dcDetail>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROWKEY:
      return getRowkey();

    case START_TIME:
      return getStartTime();

    case END_TIME:
      return getEndTime();

    case DEVICE_NAME:
      return getDeviceName();

    case MATERIAL_NAME:
      return getMaterialName();

    case GROUP:
      return getGroup();

    case SHFIT:
      return getShfit();

    case ITEMS:
      return getItems();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROWKEY:
      return isSetRowkey();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case DEVICE_NAME:
      return isSetDeviceName();
    case MATERIAL_NAME:
      return isSetMaterialName();
    case GROUP:
      return isSetGroup();
    case SHFIT:
      return isSetShfit();
    case ITEMS:
      return isSetItems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof dcPDO)
      return this.equals((dcPDO)that);
    return false;
  }

  public boolean equals(dcPDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_rowkey = true && this.isSetRowkey();
    boolean that_present_rowkey = true && that.isSetRowkey();
    if (this_present_rowkey || that_present_rowkey) {
      if (!(this_present_rowkey && that_present_rowkey))
        return false;
      if (!this.rowkey.equals(that.rowkey))
        return false;
    }

    boolean this_present_startTime = true && this.isSetStartTime();
    boolean that_present_startTime = true && that.isSetStartTime();
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (!this.startTime.equals(that.startTime))
        return false;
    }

    boolean this_present_endTime = true && this.isSetEndTime();
    boolean that_present_endTime = true && that.isSetEndTime();
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (!this.endTime.equals(that.endTime))
        return false;
    }

    boolean this_present_deviceName = true && this.isSetDeviceName();
    boolean that_present_deviceName = true && that.isSetDeviceName();
    if (this_present_deviceName || that_present_deviceName) {
      if (!(this_present_deviceName && that_present_deviceName))
        return false;
      if (!this.deviceName.equals(that.deviceName))
        return false;
    }

    boolean this_present_materialName = true && this.isSetMaterialName();
    boolean that_present_materialName = true && that.isSetMaterialName();
    if (this_present_materialName || that_present_materialName) {
      if (!(this_present_materialName && that_present_materialName))
        return false;
      if (!this.materialName.equals(that.materialName))
        return false;
    }

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_shfit = true && this.isSetShfit();
    boolean that_present_shfit = true && that.isSetShfit();
    if (this_present_shfit || that_present_shfit) {
      if (!(this_present_shfit && that_present_shfit))
        return false;
      if (!this.shfit.equals(that.shfit))
        return false;
    }

    boolean this_present_items = true && this.isSetItems();
    boolean that_present_items = true && that.isSetItems();
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (!this.items.equals(that.items))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRowkey()) ? 131071 : 524287);
    if (isSetRowkey())
      hashCode = hashCode * 8191 + rowkey.hashCode();

    hashCode = hashCode * 8191 + ((isSetStartTime()) ? 131071 : 524287);
    if (isSetStartTime())
      hashCode = hashCode * 8191 + startTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndTime()) ? 131071 : 524287);
    if (isSetEndTime())
      hashCode = hashCode * 8191 + endTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetDeviceName()) ? 131071 : 524287);
    if (isSetDeviceName())
      hashCode = hashCode * 8191 + deviceName.hashCode();

    hashCode = hashCode * 8191 + ((isSetMaterialName()) ? 131071 : 524287);
    if (isSetMaterialName())
      hashCode = hashCode * 8191 + materialName.hashCode();

    hashCode = hashCode * 8191 + ((isSetGroup()) ? 131071 : 524287);
    if (isSetGroup())
      hashCode = hashCode * 8191 + group.hashCode();

    hashCode = hashCode * 8191 + ((isSetShfit()) ? 131071 : 524287);
    if (isSetShfit())
      hashCode = hashCode * 8191 + shfit.hashCode();

    hashCode = hashCode * 8191 + ((isSetItems()) ? 131071 : 524287);
    if (isSetItems())
      hashCode = hashCode * 8191 + items.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(dcPDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRowkey()).compareTo(other.isSetRowkey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowkey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowkey, other.rowkey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeviceName()).compareTo(other.isSetDeviceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceName, other.deviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaterialName()).compareTo(other.isSetMaterialName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaterialName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.materialName, other.materialName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(other.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, other.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShfit()).compareTo(other.isSetShfit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShfit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shfit, other.shfit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItems()).compareTo(other.isSetItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.items, other.items);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("dcPDO(");
    boolean first = true;

    sb.append("rowkey:");
    if (this.rowkey == null) {
      sb.append("null");
    } else {
      sb.append(this.rowkey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    if (this.startTime == null) {
      sb.append("null");
    } else {
      sb.append(this.startTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    if (this.endTime == null) {
      sb.append("null");
    } else {
      sb.append(this.endTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deviceName:");
    if (this.deviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("materialName:");
    if (this.materialName == null) {
      sb.append("null");
    } else {
      sb.append(this.materialName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shfit:");
    if (this.shfit == null) {
      sb.append("null");
    } else {
      sb.append(this.shfit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("items:");
    if (this.items == null) {
      sb.append("null");
    } else {
      sb.append(this.items);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class dcPDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public dcPDOStandardScheme getScheme() {
      return new dcPDOStandardScheme();
    }
  }

  private static class dcPDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<dcPDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, dcPDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROWKEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rowkey = iprot.readString();
              struct.setRowkeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startTime = iprot.readString();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endTime = iprot.readString();
              struct.setEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceName = iprot.readString();
              struct.setDeviceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MATERIAL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.materialName = iprot.readString();
              struct.setMaterialNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.group = iprot.readString();
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SHFIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shfit = iprot.readString();
              struct.setShfitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.items = new java.util.ArrayList<dcDetail>(_list0.size);
                dcDetail _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new dcDetail();
                  _elem1.read(iprot);
                  struct.items.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, dcPDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rowkey != null) {
        oprot.writeFieldBegin(ROWKEY_FIELD_DESC);
        oprot.writeString(struct.rowkey);
        oprot.writeFieldEnd();
      }
      if (struct.startTime != null) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeString(struct.startTime);
        oprot.writeFieldEnd();
      }
      if (struct.endTime != null) {
        oprot.writeFieldBegin(END_TIME_FIELD_DESC);
        oprot.writeString(struct.endTime);
        oprot.writeFieldEnd();
      }
      if (struct.deviceName != null) {
        oprot.writeFieldBegin(DEVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.deviceName);
        oprot.writeFieldEnd();
      }
      if (struct.materialName != null) {
        oprot.writeFieldBegin(MATERIAL_NAME_FIELD_DESC);
        oprot.writeString(struct.materialName);
        oprot.writeFieldEnd();
      }
      if (struct.group != null) {
        oprot.writeFieldBegin(GROUP_FIELD_DESC);
        oprot.writeString(struct.group);
        oprot.writeFieldEnd();
      }
      if (struct.shfit != null) {
        oprot.writeFieldBegin(SHFIT_FIELD_DESC);
        oprot.writeString(struct.shfit);
        oprot.writeFieldEnd();
      }
      if (struct.items != null) {
        oprot.writeFieldBegin(ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.items.size()));
          for (dcDetail _iter3 : struct.items)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class dcPDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public dcPDOTupleScheme getScheme() {
      return new dcPDOTupleScheme();
    }
  }

  private static class dcPDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<dcPDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, dcPDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRowkey()) {
        optionals.set(0);
      }
      if (struct.isSetStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetEndTime()) {
        optionals.set(2);
      }
      if (struct.isSetDeviceName()) {
        optionals.set(3);
      }
      if (struct.isSetMaterialName()) {
        optionals.set(4);
      }
      if (struct.isSetGroup()) {
        optionals.set(5);
      }
      if (struct.isSetShfit()) {
        optionals.set(6);
      }
      if (struct.isSetItems()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetRowkey()) {
        oprot.writeString(struct.rowkey);
      }
      if (struct.isSetStartTime()) {
        oprot.writeString(struct.startTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeString(struct.endTime);
      }
      if (struct.isSetDeviceName()) {
        oprot.writeString(struct.deviceName);
      }
      if (struct.isSetMaterialName()) {
        oprot.writeString(struct.materialName);
      }
      if (struct.isSetGroup()) {
        oprot.writeString(struct.group);
      }
      if (struct.isSetShfit()) {
        oprot.writeString(struct.shfit);
      }
      if (struct.isSetItems()) {
        {
          oprot.writeI32(struct.items.size());
          for (dcDetail _iter4 : struct.items)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, dcPDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.rowkey = iprot.readString();
        struct.setRowkeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTime = iprot.readString();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.endTime = iprot.readString();
        struct.setEndTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.deviceName = iprot.readString();
        struct.setDeviceNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.materialName = iprot.readString();
        struct.setMaterialNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.group = iprot.readString();
        struct.setGroupIsSet(true);
      }
      if (incoming.get(6)) {
        struct.shfit = iprot.readString();
        struct.setShfitIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.items = new java.util.ArrayList<dcDetail>(_list5.size);
          dcDetail _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new dcDetail();
            _elem6.read(iprot);
            struct.items.add(_elem6);
          }
        }
        struct.setItemsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

