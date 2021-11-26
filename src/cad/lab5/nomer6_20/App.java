package cad.lab5.nomer6_20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite radius: ");
        double radius = scanner.nextDouble();

        double area = circleArea(radius);
        System.out.println("Ploshadi kruga = " + area);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
