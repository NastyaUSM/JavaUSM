package cad.lab3.nomer4_19;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Programma raschitivaet polnuiu zarplatu prodavtsa. Dlia vihoda vvedite [-1]!");

        Scanner scanner = new Scanner(System.in);
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();

        while (true) {
            System.out.print("Vvedite item value: ");
            double itemValue = scanner.nextDouble();

            if (itemValue == -1) {
                break;
            }

            salesCommissionCalculator.addItemValue(itemValue);
        }

        salesCommissionCalculator.displayEarnings();
    }
}
