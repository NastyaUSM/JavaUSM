package cad.lab3.nomer4_37;

public class Math {

    public double factorial(int n) {
        double result = 1;

        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
        }

        return result;
    }


    public double e(double x) {
        int n = 100;
        double result = 0;

        for (int i = 0; i < n; i++) {
            double xPowI = java.lang.Math.pow(x, i);
            double factorial = factorial(i);

            if (xPowI < 0 || factorial < 0) {
                break;
            }

            result = result + (xPowI / factorial);
        }

        return result;
    }
}
