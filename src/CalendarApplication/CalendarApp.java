package CalendarApplication;

import java.util.Scanner;

public class CalendarApp {
    public static void main(String[] args) {

        int year = getYearFromUser();
        int month = getMonthFromUser();

        Date date = new Date(year, month);
        Display display = new Display();
        display.showCalendar(date);

    }

    private static int getYearFromUser() {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        while (true) {
            try {
                System.out.print("Yil Giriniz: ");
                year = Integer.parseInt(scanner.nextLine());
                if (year <= 0) {
                    throw new NumberFormatException("Yil bir pozitif deger olmali");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Gecersiz giris. Lutfen gecerli bir yil giriniz.");
            }
        }
        return year;
    }

    private static int getMonthFromUser() {
        Scanner scanner = new Scanner(System.in);
        int month = 0;

        while (true) {
            try {
                System.out.print("Ay Giriniz (1-12): ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new NumberFormatException("Ay numarasi 1-12 arasinda olmalidir");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Gecersiz giris. Lutfen gecerli bir ay numarasi giriniz.");
            }
        }
        return month;
    }

}
