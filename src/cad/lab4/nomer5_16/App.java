package cad.lab4.nomer5_16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite chislo 1:");
        int number1 = scanner.nextInt();

        System.out.print("Vvedite chislo 2:");
        int number2 = scanner.nextInt();

        System.out.print("Vvedite chislo 3:");
        int number3 = scanner.nextInt();

        System.out.print("Vvedite chislo 4:");
        int number4 = scanner.nextInt();

        System.out.print("Vvedite chislo 5:");
        int number5 = scanner.nextInt();

        System.out.print("1) ");
        printBar(number1);

        System.out.print("2) ");
        printBar(number2);

        System.out.print("3) ");
        printBar(number3);

        System.out.print("4) ");
        printBar(number4);

        System.out.print("5) ");
        printBar(number5);
    }

    public static void printBar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
