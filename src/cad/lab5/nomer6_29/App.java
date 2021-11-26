package cad.lab5.nomer6_29;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static int numberOfHeads = 0;
    public static int numberOfTails = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Igra \"Podbrosi monetku\"! Dlia zapuska monetki vvedite [1], dlia vihoda [0]!");

        while (true) {
            System.out.print(">>> ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number == 1) {
                Coin coin = flip();

                switch (coin) {
                    case HEADS:
                        System.out.println("Vipala reshka!");
                        break;
                    case TAILS:
                        System.out.println("Vipal oriol!");
                        break;
                }
            }
        }

        System.out.println("Vsego reshek = " + numberOfHeads);
        System.out.println("Vsego orlov = " + numberOfTails);
    }

    public static Coin flip() {
        int random = new Random().nextInt(2);

        if (random == 0) {
            numberOfHeads = numberOfHeads + 1;
            return Coin.HEADS;
        } else {
            numberOfTails = numberOfTails + 1;
            return Coin.TAILS;
        }
    }
}
