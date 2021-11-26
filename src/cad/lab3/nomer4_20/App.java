package cad.lab3.nomer4_20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int employeeCounter = 1;

        //Первый работник
        calculateSalary(employeeCounter);
        employeeCounter = employeeCounter + 1;

        //Второй работник
        calculateSalary(employeeCounter);
        employeeCounter = employeeCounter + 1;

        //Третий работник
        calculateSalary(employeeCounter);
        employeeCounter = employeeCounter + 1;
    }

    public static void calculateSalary(int nomer) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite kolichestvo chasov raboti dlia rabotnika " + nomer + ": ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Vvedite stoimosti chasa dlia rabotnika " + nomer + ": ");
        double hoursRate = scanner.nextDouble();

        Employee employee = new Employee(hoursWorked, hoursRate);
        salaryCalculator.calculateSalary(employee);
    }
}
