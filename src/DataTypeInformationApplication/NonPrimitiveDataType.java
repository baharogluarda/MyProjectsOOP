package DataTypeInformationApplication;

public class NonPrimitiveDataType implements DataType {
    private DataTypeEnum dataTypeEnum;

    public NonPrimitiveDataType(DataTypeEnum dataTypeEnum) {
        this.dataTypeEnum = dataTypeEnum;
    }

    @Override
    public void showInfo() {
        System.out.println("Non-Primitive Data Type: " + dataTypeEnum.getTypeName());
        System.out.println("Açıklama: " + dataTypeEnum.getDescription());
    }
}
