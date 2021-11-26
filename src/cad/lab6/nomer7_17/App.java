package cad.lab6.nomer7_17;

public class App {

    public static final int MAX_ROLLS = 36000000;

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Table table = new Table();

        for (int i = 0; i < MAX_ROLLS; i++) {
            int side1 = dice1.roll();
            int side2 = dice2.roll();

            table.incrementSum(side1 + side2);
        }

        table.printTable();
    }
}
