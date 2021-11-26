package cad.lab3.nomer4_37;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math math = new Math();

        System.out.print("Vvedite polojitelinoe chislo n: ");
        int n = scanner.nextInt();

        System.out.println(n + "! = " + math.factorial(n));

        System.out.print("Vvedite x: ");
        double x = scanner.nextDouble();

        System.out.println("e = " + math.e(1));
        System.out.println("e^x = " + math.e(x));
    }
}
