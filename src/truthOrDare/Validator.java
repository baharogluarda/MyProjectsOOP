package truthOrDare;

public class Validator {
    public boolean isValidChoice(String choice){
        return choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("C");
    }
}
