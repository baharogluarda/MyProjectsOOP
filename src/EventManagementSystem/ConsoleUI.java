package EventManagementSystem;

import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;

    public ConsoleUI(){
        this.scanner = new Scanner(System.in);
    }

    public String getInput(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
