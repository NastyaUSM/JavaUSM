package cad.lab3.nomer4_31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo v dvoichnoi sisteme schislenia:");
        int binaryNumber = scanner.nextInt();
        int decimalNumber = 0;

        int counter = 0;
        while (binaryNumber != 0) {
            int digit = binaryNumber % 10;

            decimalNumber = decimalNumber + (digit * (int) Math.pow(2, counter));

            counter++;
            binaryNumber = binaryNumber / 10;
        }

        System.out.println("Desiaticinoie chislo: " + decimalNumber);
    }
}
