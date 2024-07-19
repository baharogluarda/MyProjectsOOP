package CalendarApplication;

public class Display {
    public void showCalendar(Date date) {
        Year year = date.getYear();
        Month month = date.getMonth();

        System.out.println("Yil: " + year.getYear());
        System.out.println("Ay: " + month.getMonthName());

        int daysInMonth = month.getDaysInMonth();
        for (int i = 1; i <= daysInMonth; i++) {
            Day day = new Day(i);
            System.out.println("Gün: " + day.getDay());
        }
    }
}
