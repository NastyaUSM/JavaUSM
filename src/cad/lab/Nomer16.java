package cad.lab;

import java.util.Scanner;

public class Nomer16 {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite pervoe chislo: ");
        a = scanner.nextInt();

        System.out.print("Vvedite vtoroe chislo: ");
        b = scanner.nextInt();

        if (a < b) {
            System.out.printf("%d < %d%n", a, b);
        }
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        if (a == b) {
            System.out.println(a + "==" + b);
        }
        if (a != b) {
            System.out.println(a + "!=" + b);
        }
        if (a >= b) {
            System.out.println(a + ">=" + b);
        }
        if (a <= b) {
            System.out.println(a + "<=" + b);
        }
    }
}
