package cad.lab2.nomer3_17;

import java.time.LocalDate;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;

    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    private double height;
    private double weight;

    public HealthProfile(String firstName,
                         String lastName,
                         String gender,
                         int yearOfBirth,
                         int monthOfBirth,
                         int dayOfBirth,
                         double height,
                         double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

        setYearOfBirth(yearOfBirth);
        setMonthOfBirth(monthOfBirth);
        setDayOfBirth(dayOfBirth);

        setHeight(height);
        setWeight(weight);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
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

    //BMI = вес в фунтах * 703 / (рост в дюймах)^2
    public double getBodyMassIndex() {
        return (weight * 703) / (height * height);
    }

    public String getBMIValue() {
        double bodyMassIndex = getBodyMassIndex();
        if (bodyMassIndex < 18.5) {
            return "Underweight";
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            return "Normal";
        } else if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9) {
            return "Overweight";
        } else if (bodyMassIndex >= 30) {
            return "Obese";
        }

        return "Unknown";
    }
}
