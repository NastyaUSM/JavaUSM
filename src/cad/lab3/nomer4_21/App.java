package cad.lab3.nomer4_21;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = 0;
        for (int counter = 0; counter < 10; counter++) {
            System.out.print("Vvedite chislo " + (counter + 1) + ": ");
            int number = scanner.nextInt();

            if (counter == 0 || number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number: " + largest);
    }
}
