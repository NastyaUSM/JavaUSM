package cad.lab5.nomer6_16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Vvedite chislo 2: ");
        int number2 = scanner.nextInt();

        boolean isMultiple = isMultiple(number1, number2);
        if (isMultiple) {
            System.out.println("Chislo " + number1 + " iavliaetsia kratnim chislu " + number2);
        } else {
            System.out.println("Chislo " + number1 + " ne iavliaetsia kratnim chislu " + number2);
        }
    }

    public static boolean isMultiple(int number1, int number2) {
        int ostatok = number1 % number2;
        if (ostatok == 0) {
            return true;
        } else {
            return false;
        }
    }
}
