package cad.lab4.nomer5_11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Programma schitaet samoie minimalinoe chislo! Dlia vihoda vvedite [-1]!");

        System.out.print("Vvedite kolicestvo chisel:");
        int kolicestvo = scanner.nextInt();

        if (kolicestvo == -1) {
            return;
        }

        int min = 0;

        int numberCounter = 1;
        while (true) {
            System.out.print("Vvedite chislo " + numberCounter + ": ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (numberCounter == 1) {
                min = number;
            }

            if (number < min) {
                min = number;
            }

            numberCounter = numberCounter + 1;
        }

        System.out.println("Min number = " + min);
    }
}
