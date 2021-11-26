package cad.lab;

import java.util.Scanner;

public class Nomer17 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite pervoe chislo: ");
        a = scanner.nextInt();

        System.out.print("Vvedite vtoroe chislo: ");
        b = scanner.nextInt();

        System.out.print("Vvedite tretie chislo: ");
        c = scanner.nextInt();

        int sum = a + b + c;
        System.out.println("Sum = " + sum);

        int average = (a + b + c) / 3;
        System.out.println("Average = " + average);

        int product = a * b * c;
        System.out.println("Product = " + product);

        int min;
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Max znacenie = " + max);
        System.out.println("Min znacenie = " + min);
    }
}
