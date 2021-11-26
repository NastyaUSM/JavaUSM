package cad.lab;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Nomer28 {
    public static void main(String[] args) {
        int r;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedi radius: ");
        r = scanner.nextInt();

        if (r < 0) {
            System.out.println("Radius ne mojet biti otritcatelinim");
        } else {
            int diameter = 2 * r;
            double okrujnosti = 2 * PI * r;
            double area = PI * r * r;

            System.out.printf("Diameter is %d%n", diameter);
            System.out.printf("Okrujnosti is %f%n", okrujnosti);
            System.out.printf("Area is %f", area);

        }
    }
}
