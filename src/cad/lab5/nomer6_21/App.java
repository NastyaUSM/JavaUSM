package cad.lab5.nomer6_21;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo [1 - 99999]: ");
        int number = scanner.nextInt();

        if (number >= 1 && number < 100000) {
            displayDigits(number);
        }
    }

    public static int part(int number1, int number2) {
        return number1 / number2;
    }

    public static int remainder(int number1, int number2) {
        return number1 % number2;
    }

    public static void displayDigits(int number) {
        String result = "";

        while (number > 0) {
            int remainder = remainder(number, 10);
            result = remainder + " " + result;
            number = part(number, 10);
        }

        System.out.println(result);
    }

}
