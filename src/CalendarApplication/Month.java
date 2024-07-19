package CalendarApplication;

public class Month {
    private int month;
    private Year year;

    private static final String[] MONTH_NAMES = {
            "Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran",
            "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik"
    };

    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Month(int month, Year year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public String getMonthName() {
        return MONTH_NAMES[month - 1];
    }

    public int getDaysInMonth() {
        if (month == 2 && year.isLeapYear()) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

}
