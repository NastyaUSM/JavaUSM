package cad.lab4.nomer5_13;

public class App {

    public static void main(String[] args) {
        Math math = new Math();

        System.out.println("N\t\tN!");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "\t\t" + math.factorial(i));
        }
    }
}
