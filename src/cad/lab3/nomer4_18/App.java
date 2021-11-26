package cad.lab3.nomer4_18;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite nomer accounta:");
        int accountNumber = scanner.nextInt();

        System.out.print("Vvedite balance s nachala tekushego mesiatsa:");
        int balanceAtStartOfMonth = scanner.nextInt();

        System.out.print("Vvedite vashi rashodi: ");
        int charges = scanner.nextInt();

        System.out.print("Vvedite vashi krediti: ");
        int credits = scanner.nextInt();

        System.out.print("Vvedite limit creditnoi summi: ");
        int creditLimit = scanner.nextInt();

        CreditLimitCalculator account = new CreditLimitCalculator(accountNumber, balanceAtStartOfMonth, charges, credits, creditLimit);
        account.calculateBalance();
    }
}
