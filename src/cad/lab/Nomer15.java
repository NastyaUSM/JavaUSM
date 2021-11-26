package cad.lab;

import java.util.Scanner;

public class Nomer15 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite pervoe chislo: ");
        a = scanner.nextInt();

        System.out.print("Vvedite vtoroe chislo: ");
        b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        int product = a * b;
        System.out.println("Product = " + product);

        int difference = a - b;
        System.out.println("Difference = " + difference);

        int division = a / b;
        System.out.println("Division = " + division);


    }
}
