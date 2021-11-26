package cad.lab;

import java.util.Scanner;

public class Nomer32 {


    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedi pervoe chislo: ");
        number1 = scanner.nextInt();

        System.out.print("Vvedi vtoroe chislo: ");
        number2 = scanner.nextInt();

        System.out.print("Vvedi tretie chislo: ");
        number3 = scanner.nextInt();

        System.out.print("Vvedi cetviortoe chislo: ");
        number4 = scanner.nextInt();

        System.out.print("Vvedi piatoe chislo: ");
        number5 = scanner.nextInt();

        if (number1 > 0) {
            positiveCount = positiveCount + 1;
        } else if (number1 < 0) {
            negativeCount = negativeCount + 1;
        } else {
            zeroCount = zeroCount + 1;
        }

        if (number2 > 0) {
            positiveCount = positiveCount + 1;
        } else if (number2 < 0) {
            negativeCount = negativeCount + 1;
        } else {
            zeroCount = zeroCount + 1;
        }

        if (number3 > 0) {
            positiveCount = positiveCount + 1;
        } else if (number3 < 0) {
            negativeCount = negativeCount + 1;
        } else {
            zeroCount = zeroCount + 1;
        }

        if (number4 > 0) {
            positiveCount = positiveCount + 1;
        } else if (number4 < 0) {
            negativeCount = negativeCount + 1;
        } else {
            zeroCount = zeroCount + 1;
        }

        if (number5 > 0) {
            positiveCount = positiveCount + 1;
        } else if (number5 < 0) {
            negativeCount = negativeCount + 1;
        } else {
            zeroCount = zeroCount + 1;
        }

        System.out.println("Kolicestvo polojitelinih znacenii: " + positiveCount);
        System.out.println("Kolicestvo otrithatelinih znacenii: " + negativeCount);
        System.out.println("Kolicestvo nulevih znacenii: " + zeroCount);
    }
}
