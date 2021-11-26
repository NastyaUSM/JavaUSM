package cad.lab5.nomer6_22;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite gradus po Farengeitu: ");
        double fahrenheit = scanner.nextDouble();

        System.out.print("Vvedite gradus po Celisiu: ");
        double celsius = scanner.nextDouble();

        System.out.println("Farengeit " + fahrenheit + " --- Celsii " + celsius(fahrenheit));
        System.out.println("Celisii " + celsius + " --- Farengeit " + fahrenheit(celsius));
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
