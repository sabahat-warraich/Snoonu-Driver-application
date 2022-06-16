package main.java.app.pojo;

public class CreateTaskMetaDataFields {
    private String clientViewAllowed;

    private String metaDataTypeId;

    private CreateTaskMetaDataType metaDataType;

    private String colorHex;

    private String value;

    private String key;

    public String getClientViewAllowed ()
    {
        return clientViewAllowed;
    }

    public void setClientViewAllowed (String clientViewAllowed)
    {
        this.clientViewAllowed = clientViewAllowed;
    }

    public String getMetaDataTypeId ()
    {
        return metaDataTypeId;
    }

    public void setMetaDataTypeId (String metaDataTypeId)
    {
        this.metaDataTypeId = metaDataTypeId;
    }

    public CreateTaskMetaDataType getMetaDataType ()
    {
        return metaDataType;
    }

    public void setMetaDataType (CreateTaskMetaDataType metaDataType)
    {
        this.metaDataType = metaDataType;
    }

    public String getColorHex ()
    {
        return colorHex;
    }

    public void setColorHex (String colorHex)
    {
        this.colorHex = colorHex;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

}
