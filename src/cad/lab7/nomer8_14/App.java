package cad.lab7.nomer8_14;

public class App {

    public static void main(String[] args) {
        Date date1 = new Date(6, 6, 2021);
        Date date2 = new Date("July", 21, 2021);
        Date date3 = new Date(341, 2021);

        System.out.println("Date 1:");
        date1.print1();
        date1.print2();
        date1.print3();

        System.out.println();

        System.out.println("Date 2:");
        date2.print1();
        date2.print2();
        date2.print3();

        System.out.println();

        System.out.println("Date 3:");
        date3.print1();
        date3.print2();
        date3.print3();
    }
}
