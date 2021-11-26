package cad.lab;

import java.util.Scanner;

public class Nomer26 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedi pervoe chislo: ");
        number1 = scanner.nextInt();

        System.out.print("Vvedi vtoroe chislo: ");
        number2 = scanner.nextInt();

        if (number2 == 0) {
            System.out.println("Delenie na noli nevozmojno");
        } else {
            if (number1 % number2 == 0) {
                System.out.println("Pervoe chislo " + number1 + " kratno vtoromu chislu " + number2);
            } else {
                System.out.println("Pervoe chislo " + number1 + " ne kratno vtoromu chislu " + number2);
            }

        }
    }
}