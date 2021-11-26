package cad.lab3.nomer4_36;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite storonu 1: ");
        double storona1 = scanner.nextDouble();

        System.out.print("Vvedite storonu 2: ");
        double storona2 = scanner.nextDouble();

        System.out.print("Vvedite storonu 3: ");
        double storona3 = scanner.nextDouble();

        Triangle triangle = new Triangle(storona1, storona2, storona3);
        triangle.displayIsRight();
    }
}
