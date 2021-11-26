package cad.lab5.nomer6_19;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite dlinu kvadrata: ");
        int side = scanner.nextInt();

        System.out.print("Vvedite simvol dlia risovania: ");
        char symbol = scanner.next().charAt(0);

        drawSquare(side, symbol);
    }

    public static void drawSquare(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" " + fillCharacter);
            }
            System.out.println();
        }
    }
}
