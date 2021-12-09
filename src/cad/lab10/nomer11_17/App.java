package cad.lab10.nomer11_17;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try {
            throwExceptionA();
        } catch (Exception e) {
            System.out.println("ExceptionA handled by Exception");
        }

        try {
            throwExceptionB();
        } catch (Exception a) {
            System.out.println("ExceptionA handled ExceptionB");
        }

        try {
            throwNullPointerException();
        } catch (Exception a) {
            System.out.println("NullPointerException handled by Exception");
        }

        try {
            throwIOException();
        } catch (Exception a) {
            System.out.println("IOException handled by Exception");
        }
    }

    public static void throwExceptionA() throws ExceptionA {
        throw new ExceptionA();
    }

    public static void throwExceptionB() throws ExceptionB {
        throw new ExceptionB();
    }

    public static void throwNullPointerException() {
        throw new NullPointerException();
    }

    public static void throwIOException() throws IOException {
        throw new IOException();
    }
}
