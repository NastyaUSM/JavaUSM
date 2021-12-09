package cad.lab7.nomer8_7;

public class App {

    public static void main(String[] args) {
        Time2 t1 = new Time2(22, 58, 59);
        Time2 t2 = new Time2(23, 45, 30);
        Time2 t3 = new Time2(23, 59, 59);

        System.out.println("Constructed with:");
        displayTime("t1: ", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);

        //увеличение на 1 минуту
        t1.incrementMinute();
        displayTime("Increment into the next minute", t1);

        //увеличение на 1 час
        t1.incrementHour(); //incrementing into the next hour
        displayTime("Increment into the next hour", t1);

        //увеличение на 1 час с переходом на новый день
        t2.incrementHour(); //increment into the next day
        displayTime("Increment into the next day", t2);

        //увеличение на 1 минуту с переходом на следующий день
        t3.incrementMinute(); //increment into the next day
        displayTime("Increment into the next day", t3);


    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }

}
