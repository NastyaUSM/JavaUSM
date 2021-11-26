package cad.lab4.nomer5_12;

public class App {

    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1) {
                product = product * i;
            }
        }

        System.out.println("Product of odd numbers = " + product);
    }
}
