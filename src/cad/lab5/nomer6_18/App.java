package cad.lab5.nomer6_18;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite dlinu kvadrata: ");
        int side = scanner.nextInt();

        drawSquare(side);
    }

    public static void drawSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
