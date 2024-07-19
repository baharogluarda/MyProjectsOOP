package truthOrDare;

import java.util.Scanner;

public class Game {
    private Player player;
    private Truth truth;
    private Dare dare;
    private Validator validator;
    private Scanner scanner;

    public Game() {
        player = new Player();
        truth = new Truth();
        dare = new Dare();
        scanner = new Scanner(System.in);
        validator = new Validator();
    }

    public void start(){
        System.out.println("Doğruluk Cesaret Oyunu'na hoş geldiniz!");
        while (true){
            System.out.println("Doğruluk (D) mu Cesaret (C) mi? (Çıkmak için 'exit' yazınız): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")){
                System.out.println("Oyundan cikiliyor...");
                break;
            }

            if (!validator.isValidChoice(choice)){
                System.out.println("Lutfen gecerli bir yanit giriniz!");
                continue;
            }

            if (choice.equalsIgnoreCase("D")) {
                System.out.println(truth.getRandomQuestion());
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println(dare.getRandomDare());
            }

            System.out.println("Yanitinizi giriniz : ");
            String answer = scanner.nextLine();
            System.out.println("Yanıtınız: " + answer);

            System.out.println("Devam etmek için 'enter' tuşuna basınız.");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

}
