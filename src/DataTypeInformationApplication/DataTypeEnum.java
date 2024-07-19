package DataTypeInformationApplication;

public enum DataTypeEnum {
    BYTE("byte", "8 bit", "-128 ile 127 arasında tam sayı değerlerini tutar."),
    SHORT("short", "16 bit", "-32,768 ile 32,767 arasında tam sayı değerlerini tutar."),
    INT("int", "32 bit", "-2,147,483,648 ile 2,147,483,647 arasında tam sayı değerlerini tutar."),
    LONG("long", "64 bit", "-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasında tam sayı değerlerini tutar."),
    FLOAT("float", "32 bit", "Kesirli sayıları (ondalık sayılar) tutar."),
    DOUBLE("double", "64 bit", "Kesirli sayıları (ondalık sayılar) tutar."),
    CHAR("char", "16 bit", "Tek bir Unicode karakterini tutar."),
    BOOLEAN("boolean", "1 bit", "İki değer alabilir: true veya false."),
    STRING("String", "Karakter dizisi", "Karakter dizilerini tutar. Immutable (değiştirilemez) bir türdür."),
    ARRAY("Array", "Aynı türden birden fazla değer", "Sabir boyutlu bir veri yapısıdır."),
    CLASS("Class", "Nesne tabanlı programlama şablonu", "Nesnelerin oluşturulmasını sağlar."),
    INTERFACE("Interface", "Sınıf sözleşmesi", "Çoklu kalıtım için kullanılır."),
    ENUM("Enum", "Sabit değerler kümesi", "Daha iyi kod okunabilirliği sağlar."),
    OBJECT("Object", "Tüm Java sınıflarının üst sınıfı", "Diğer tüm non-primitive türler Object sınıfından türetilir."),
    COLLECTION("Collection Framework", "Veri kümeleriyle çalışma", "List, Set, Map gibi yapılar içerir.");

    private final String typeName;
    private final String size;
    private final String description;

    DataTypeEnum(String typeName, String size, String description) {
        this.typeName = typeName;
        this.size = size;
        this.description = description;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}
