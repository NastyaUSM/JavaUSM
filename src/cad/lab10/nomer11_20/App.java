package cad.lab10.nomer11_20;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (IOException ioException) {
            System.out.println("Exception message: " + ioException.getMessage());
        }
    }

    public static void someMethod() throws IOException {
        try {
            someMethod2();
        } catch (IOException ioException) {
            throw ioException;
        }
    }

    public static void someMethod2() throws IOException {
        throw new IOException("Thrown Exception from someMethod2");
    }
}
