package DataTypeInformationApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public DataType getUserChoice() {
        System.out.println("Hangi veri türü hakkında bilgi almak istersiniz?");
        System.out.println("1. Primitive Veri Türleri");
        System.out.println("2. Non-Primitive Veri Türleri");

        int choice = getValidInteger();

        if (choice == 1) {
            return selectPrimitiveDataType();
        } else if (choice == 2) {
            return selectNonPrimitiveDataType();
        } else {
            System.out.println("Geçersiz seçim. Lütfen 1 veya 2 girin.");
            return getUserChoice();
        }
    }

    private int getValidInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir tamsayı girin.");
                scanner.next();
                System.out.println("İlk 8 veri türünden birini seçin:");
            }
        }
    }

    public char getValidChar() {
        while (true) {
            String input = scanner.next();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.println("Geçersiz giriş. Lütfen sadece bir karakter girin.");
        }
    }

    private DataType selectPrimitiveDataType() {
        System.out.println("Primitive Veri Türleri:");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");
        int choice = getValidInteger();

        switch (choice) {
            case 1: return new PrimitiveDataType(DataTypeEnum.BYTE);
            case 2: return new PrimitiveDataType(DataTypeEnum.SHORT);
            case 3: return new PrimitiveDataType(DataTypeEnum.INT);
            case 4: return new PrimitiveDataType(DataTypeEnum.LONG);
            case 5: return new PrimitiveDataType(DataTypeEnum.FLOAT);
            case 6: return new PrimitiveDataType(DataTypeEnum.DOUBLE);
            case 7: return new PrimitiveDataType(DataTypeEnum.CHAR);
            case 8: return new PrimitiveDataType(DataTypeEnum.BOOLEAN);
            default:
                System.out.println("Geçersiz seçim.");
                return selectPrimitiveDataType();
        }
    }

    private DataType selectNonPrimitiveDataType() {
        System.out.println("Non-Primitive Veri Türleri:");
        System.out.println("1. String");
        System.out.println("2. Array");
        System.out.println("3. Class");
        System.out.println("4. Interface");
        System.out.println("5. Enum");
        System.out.println("6. Object");
        System.out.println("7. Collection Framework");
        int choice = getValidInteger();

        switch (choice) {
            case 1: return new NonPrimitiveDataType(DataTypeEnum.STRING);
            case 2: return new NonPrimitiveDataType(DataTypeEnum.ARRAY);
            case 3: return new NonPrimitiveDataType(DataTypeEnum.CLASS);
            case 4: return new NonPrimitiveDataType(DataTypeEnum.INTERFACE);
            case 5: return new NonPrimitiveDataType(DataTypeEnum.ENUM);
            case 6: return new NonPrimitiveDataType(DataTypeEnum.OBJECT);
            case 7: return new NonPrimitiveDataType(DataTypeEnum.COLLECTION);
            default:
                System.out.println("Geçersiz seçim.");
                return selectNonPrimitiveDataType();
        }
    }
}
