package cad.lab7.nomer8_14;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(String month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(int dayOfYear, int year) {
        if (dayOfYear > 0) {
            int month = 0;
            int days = 0;
            while (days < dayOfYear) {
                month++;
                switch (month) {
                    case 1:
                        days += 31;
                        break;
                    case 2:
                        if (year % 4 == 0) {
                            days += 29;
                        } else {
                            days += 28;
                        }
                        break;
                    case 3:
                        days += 31;
                        break;
                    case 4:
                        days += 30;
                        break;
                    case 5:
                        days += 31;
                        break;
                    case 6:
                        days += 30;
                        break;
                    case 7:
                        days += 31;
                        break;
                    case 8:
                        days += 31;
                        break;
                    case 9:
                        days += 30;
                        break;
                    case 10:
                        days += 31;
                        break;
                    case 11:
                        days += 30;
                        break;
                    case 12:
                        days += 31;
                        break;
                }
            }
            setMonth(month);

            int daysTillEndOfMonth = days - dayOfYear;
            switch (month) {
                case 1:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 2:
                    if (year % 4 == 0) {
                        setDay(29 - daysTillEndOfMonth);
                    } else {
                        setDay(28 - daysTillEndOfMonth);
                    }
                    break;
                case 3:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 4:
                    setDay(30 - daysTillEndOfMonth);
                    break;
                case 5:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 6:
                    setDay(30 - daysTillEndOfMonth);
                    break;
                case 7:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 8:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 9:
                    setDay(30 - daysTillEndOfMonth);
                    break;
                case 10:
                    setDay(31 - daysTillEndOfMonth);
                    break;
                case 11:
                    setDay(30 - daysTillEndOfMonth);
                    break;
                case 12:
                    setDay(31 - daysTillEndOfMonth);
                    break;
            }

            setDay(day);
        }

        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
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

    public void setMonth(String month) {
        if (month.equals("January")) {
            this.month = 1;
        }
        if (month.equals("February")) {
            this.month = 2;
        }
        if (month.equals("March")) {
            this.month = 3;
        }
        if (month.equals("April")) {
            this.month = 4;
        }
        if (month.equals("May")) {
            this.month = 5;
        }
        if (month.equals("June")) {
            this.month = 6;
        }
        if (month.equals("July")) {
            this.month = 7;
        }
        if (month.equals("August")) {
            this.month = 8;
        }
        if (month.equals("September")) {
            this.month = 9;
        }
        if (month.equals("October")) {
            this.month = 10;
        }
        if (month.equals("November")) {
            this.month = 11;
        }
        if (month.equals("December")) {
            this.month = 12;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public void print1() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public void print2() {
        String month = "";
        switch (this.month) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        System.out.println(month + " " + day + ", " + year);
    }

    public void print3() {
        int dayOfYear = 0;
        int counterMonth = 1;
        while (counterMonth < this.month) {
            switch (counterMonth) {
                case 1:
                    dayOfYear += 31;
                    break;
                case 2:
                    if (year % 4 == 0) {
                        dayOfYear += 29;
                    } else {
                        dayOfYear += 28;
                    }
                    break;
                case 3:
                    dayOfYear += 31;
                    break;
                case 4:
                    dayOfYear += 30;
                    break;
                case 5:
                    dayOfYear += 31;
                    break;
                case 6:
                    dayOfYear += 30;
                    break;
                case 7:
                    dayOfYear += 31;
                    break;
                case 8:
                    dayOfYear += 31;
                    break;
                case 9:
                    dayOfYear += 30;
                    break;
                case 10:
                    dayOfYear += 31;
                    break;
                case 11:
                    dayOfYear += 30;
                    break;
                case 12:
                    dayOfYear += 31;
                    break;
            }
            counterMonth++;
        }

        dayOfYear += day;

        System.out.println(dayOfYear + " " + year);
    }
}
