package cad.lab5.nomer6_31;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Igra \"Ugadai chislo\"! Budet zagadano chislo [1 - 1000]. Vam nujno ugadati ego. " +
                "Dlia vihoda vvedite [0]!");

        System.out.println("Chislo zagadano!");
        int randomNumber = new Random().nextInt(1000) + 1;

        int guesses = 0;

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
                guesses = guesses + 1;

                System.out.println("Congratulations. You guessed the number!");

                if (guesses < 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                } else if (guesses == 10) {
                    System.out.println("Aha! You know the secret!");
                } else {
                    System.out.println("You should be able to do better!");
                }

                break;
            }

            guesses = guesses + 1;
        }
    }
}
