package cad.lab6.nomer7_15;

public class App {

    public static void main(String[] args) {
        int length = 10;

        if (args.length > 0) {

            length = Integer.parseInt(args[0]);

        }

        int[] array = new int[length];

        System.out.println("Dlina massiva = " + length);
    }

}
