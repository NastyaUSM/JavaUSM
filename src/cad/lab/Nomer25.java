package cad.lab;

import java.util.Scanner;

public class Nomer25 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedi chislo: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Chislo " + number + " chiotnoe");
        } else if (number % 2 == 1) {
            System.out.println("Chislo " + number + " nechiotnoe");
        }

    }
}
