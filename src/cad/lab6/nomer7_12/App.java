package cad.lab6.nomer7_12;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Dlia zapolnenia massiva vvodite chisla [10; 100]!");

        int counter = 0;

        while (counter != array.length) {
            System.out.print("Vvedite chislo: ");
            int number = scanner.nextInt();

            if (number < 10 || number > 100) {
                continue;
            }

            if (counter == 0) {
                array[counter] = number;
            } else {

                boolean soderjitNumber = false;
                for (int i = 0; i < counter; i++) {
                    if (array[i] == number) {
                        soderjitNumber = true;
                    }
                }

                if (!soderjitNumber) {
                    array[counter] = number;
                } else {
                    continue;
                }

            }

            displayArray(array);
            counter = counter + 1;
        }
    }

    public static void displayArray(int[] array) {
        System.out.print(">>> ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
