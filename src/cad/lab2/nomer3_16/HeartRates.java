package cad.lab2.nomer3_16;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public HeartRates(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;

        setYearOfBirth(yearOfBirth);
        setMonthOfBirth(monthOfBirth);
        setDayOfBirth(dayOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth <= 12) {
            this.monthOfBirth = monthOfBirth;
        }
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0 && dayOfBirth <= 31) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - yearOfBirth;

        if (currentDate.getDayOfMonth() < dayOfBirth && currentDate.getMonthValue() <= monthOfBirth) {
            age = age - 1;
        }

        return age;
    }

    //Максимально допустимый пульс = 220 - age
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    //Разрешенный пульс = 50% - 85% от максимально допустимого пульса
    public String getTargetHeartRate() {
        return 0.5 * getMaximumHeartRate() + " - " + 0.85 * getMaximumHeartRate();
    }
}
