package DataTypeInformationApplication;

public class PrimitiveDataType implements DataType {
    private DataTypeEnum dataTypeEnum;

    public PrimitiveDataType(DataTypeEnum dataTypeEnum) {
        this.dataTypeEnum = dataTypeEnum;
    }

    @Override
    public void showInfo() {
        System.out.println("Primitive Data Type: " + dataTypeEnum.getTypeName());
        System.out.println("Boyut: " + dataTypeEnum.getSize());
        System.out.println("Açıklama: " + dataTypeEnum.getDescription());
    }
}
