package cad.lab7.nomer8_8;

public class App {

    public static void main(String[] args) {
        Date date1 = new Date(12, 20, 2017);

        int finishYear = 2018;
        int finishMonth = 2;

        while (date1.getYear() != finishYear && date1.getMonth() != finishMonth) {
            date1.nextDay();
            System.out.printf("%s\n", date1);
        }

    }

}
