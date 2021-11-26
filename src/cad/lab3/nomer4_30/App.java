package cad.lab3.nomer4_30;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Dlia vihoda vvedite [-1]!");
            System.out.print("Vvedite 5 znachnoie chislo: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            //Максимально 5 значное число = 99999
            //Минимальное 5 значное число = 10000
            if (number > 99999 || number < 10000) {
                System.out.println("Vi vveli nepravilinoe chislo!");
                continue;
            }

            int firstDigit = number / 10000;
            int secondDigit = number / 1000 % 10;

            int fourthDigit = number / 10 % 10;
            int fivthDigit = number % 10;

            if (firstDigit == fivthDigit && secondDigit == fourthDigit) {
                System.out.println("Dannoie chislo iavliaetsia palindromom!");
            }
        }
    }
}
