package CalendarApplication;

public class Year {
    private int year;

    public Year(int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
