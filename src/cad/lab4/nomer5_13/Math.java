package cad.lab4.nomer5_13;

public class Math {

    public long factorial(int n) {
        long result = 1;

        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
        }

        return result;
    }
}
