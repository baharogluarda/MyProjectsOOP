package DataTypeInformationApplication;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        boolean continueRunning = true;

        while (continueRunning) {
            DataType dataType = userInput.getUserChoice();

            if (dataType instanceof PrimitiveDataType) {
                ((PrimitiveDataType) dataType).showInfo();
            } else if (dataType instanceof NonPrimitiveDataType) {
                ((NonPrimitiveDataType) dataType).showInfo();
            }

            System.out.println("\nDevam etmek istiyor musunuz? (Evet için 'E', Hayır için 'H' girin): ");
            char continueChoice = userInput.getValidChar();
            if (continueChoice == 'H' || continueChoice == 'h') {
                continueRunning = false;
            }
        }
        System.out.println("Programdan çıkılıyor...");
    }
}
