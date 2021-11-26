package cad.lab3.nomer4_20;

public class SalaryCalculator {

    public double calculateSalary(Employee employee) {
        double hoursWorked = employee.getHoursWorked();
        double hoursRate = employee.getHoursRate();

        if (hoursWorked <= 40) {
            return hoursWorked * hoursRate;
        }

        double extraHours = hoursWorked - 40;

        return 40 * hoursRate + extraHours * 1.5 * hoursRate;
    }
}
