package cad.lab5.nomer6_30;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Igra \"Ugadai chislo\"! Budet zagadano chislo [1 - 1000]. Vam nujno ugadati ego. " +
                "Dlia vihoda vvedite [0]!");

        System.out.println("Chislo zagadano!");
        int randomNumber = new Random().nextInt(1000) + 1;

        while (true) {
            System.out.print("Vvedite vashe chislo: ");

            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > randomNumber) {
                System.out.println("Too high. Try again!");
            }

            if (number < randomNumber) {
                System.out.println("Too low. Try again!");
            }

            if (number == randomNumber) {
                System.out.println("Congratulations. You guessed the number!");
                break;
            }
        }
    }
}
