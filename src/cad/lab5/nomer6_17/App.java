package cad.lab5.nomer6_17;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo: ");
        int number = scanner.nextInt();

        boolean isEven = isEven(number);

        if (isEven) {
            System.out.println("Chislo " + number + " iavliaetsia chiotnim!");
        } else {
            System.out.println("Chislo " + number + " iavliaetsia nechiotnim!");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
