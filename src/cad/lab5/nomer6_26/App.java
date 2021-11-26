package cad.lab5.nomer6_26;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Chislo naoborot: " + reversedNumber);
    }

    public static int reverse(int number) {
        int result = 0;

        while (number > 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }

        return result;
    }
}
