package cad.lab4.nomer5_14;

public class App {

    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;


        for (double rate = 0.05; rate <= 0.1; rate = rate + 0.01) {
            System.out.println("Current rate: " + rate);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%20.2f%n", year, amount);
            }

            System.out.println("----------------------------");
        }
    }
}
