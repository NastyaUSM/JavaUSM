package cad.lab3.nomer4_20;

public class Employee {

    private double hoursWorked;
    private double hoursRate;

    public Employee(double hoursWorked, double hoursRate) {
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }
}
