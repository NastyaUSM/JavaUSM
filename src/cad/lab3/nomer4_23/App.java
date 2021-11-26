package cad.lab3.nomer4_23;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest1 = 0;
        int largest2 = 0;

        for (int counter = 0; counter < 10; counter++) {
            System.out.print("Vvedite chislo " + (counter + 1) + ": ");
            int number = scanner.nextInt();

            if (largest2 > largest1) {
                int tmp = largest1;
                largest1 = largest2;
                largest2 = tmp;
            }

            if (counter == 0) {
                largest1 = number;
                continue;
            }

            if (counter == 1) {
                largest2 = number;
                continue;
            }

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
                continue;
            }

            if (number > largest2) {
                largest2 = number;
            }
        }

        System.out.println("Largest 1: " + largest1);
        System.out.println("Largest 2: " + largest2);
    }
}
