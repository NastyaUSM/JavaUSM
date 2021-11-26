package cad.lab5.nomer6_23;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo 1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Vvedite chislo 2: ");
        double number2 = scanner.nextDouble();

        System.out.print("Vvedite chislo 3: ");
        double number3 = scanner.nextDouble();

        double minimum = minimum3(number1, number2, number3);
        System.out.println("Minimalinoe chislo = " + minimum);
    }

    public static double minimum3(double number1, double number2, double number3) {
        double min1 = Math.min(number1, number2);
        double minResult = Math.min(min1, number3);
        return minResult;
    }
}
