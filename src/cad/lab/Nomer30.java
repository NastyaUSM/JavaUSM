package cad.lab;

import java.util.Scanner;

public class Nomer30 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedi chislo iz 5 chifr: ");
        number = scanner.nextInt();

        // 12345
        // indexNumber = number / (10 * (N - index)) % 10

        //12345 / 10000 % 10 = 1 % 10 = 1
        //12345 / 1000 % 10 = 12 % 10 = 2
        //12345 / 100 % 10 = 123 % 10 = 3
        //12345 / 10 % 10 = 1234 % 10 = 4
        //12345
        System.out.printf(
                "Vivod chifri: %d   %d   %d   %d   %d",
                number / 10000,
                number / 1000 % 10,
                number / 100 % 10,
                number / 10 % 10,
                number % 10
        );

    }
}
