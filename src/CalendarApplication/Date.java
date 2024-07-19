package CalendarApplication;

public class Date {
    private Year year;
    private Month month;

    public Date(int year, int month) {
        this.year = new Year(year);
        this.month = new Month(month, this.year);
    }

    public Year getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }
}
