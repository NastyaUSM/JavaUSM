package cad.lab10.nomer11_16;

public class App {

    public static void main(String[] args) {
        try {
            throwExceptionA();
        } catch (ExceptionC c) {
            System.out.println("ExceptionC handled");
        } catch (ExceptionB b) {
            System.out.println("ExceptionB handled");
        } catch (ExceptionA a) {
            System.out.println("ExceptionA handled");
        }

        try {
            throwExceptionB();
        } catch (ExceptionA a) {
            System.out.println("ExceptionA handled ExceptionB");
        }

        try {
            throwExceptionC();
        } catch (ExceptionA a) {
            System.out.println("ExceptionA handled ExceptionC");
        }
    }

    public static void throwExceptionA() throws ExceptionA {
        throw new ExceptionA();
    }

    public static void throwExceptionB() throws ExceptionB {
        throw new ExceptionB();
    }

    public static void throwExceptionC() throws ExceptionC {
        throw new ExceptionC();
    }
}
