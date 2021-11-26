package cad.lab4.nomer5_17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dlia vihoda vvedite [-1]!");

        double totalRetailValue = 0;

        while (true) {
            System.out.print("Vvedite nomer producta:");
            int nomer = scanner.nextInt();

            if (nomer == -1) {
                break;
            }

            System.out.print("Vvedite kolichestvo producta:");
            int quantity = scanner.nextInt();

            if (quantity == -1) {
                break;
            }

            double price = 0;
            switch (nomer) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.5;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
            }

            totalRetailValue = totalRetailValue + price * quantity;
        }

        System.out.println("Total retail value = " + totalRetailValue);
    }
}
