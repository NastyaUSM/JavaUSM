package cad.lab5.nomer6_15;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite storonu 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Vvedite storonu 2: ");
        double side2 = scanner.nextDouble();

        double hypotenuse = hypotenuse(side1, side2);
        System.out.println("Gipotenusa = " + hypotenuse);
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }
}
