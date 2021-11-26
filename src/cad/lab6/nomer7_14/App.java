package cad.lab6.nomer7_14;

public class App {

    public static void main(String[] args) {
        long product1 = product(1, 2, 3, 4, 5);
        long product2 = product(2, 4, 6);
        long product3 = product(10);
        long product4 = product();

        System.out.println("Proizvedenie iz 5 posledovatelinih elementov = " + product1);
        System.out.println("Proizvedenie pervih 3-h chiotnih elementov = " + product2);
        System.out.println("Proizvedenie 1 elementa = " + product3);
        System.out.println("Proizvedenie pustogo spiska = " + product4);
    }

    public static long product(int... series) {
        if (series.length == 0) {
            return 0;
        }

        long result = 1;
        for (int i = 0; i < series.length; i++) {
            result = result * series[i];
        }

        return result;
    }
}
