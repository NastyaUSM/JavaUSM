package cad.lab2.nomer3_14;

public class Date {

    private int year = 1;
    private int month = 1;
    private int day = 1;

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public void displayDate() {
        System.out.println("Date: [" + day + "/" + month + "/" + year + "]");
    }
}
