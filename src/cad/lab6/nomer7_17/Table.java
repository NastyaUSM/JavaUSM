package cad.lab6.nomer7_17;

public class Table {

    private int[] dannie = new int[11];

    public void incrementSum(int sum) {
        int index = sum - 2;
        dannie[index]++;
    }

    public void printTable() {
        System.out.println("Summa\t\tKolichestvo");
        for (int i = 0; i < dannie.length; i++) {
            System.out.println(i + 2 + "\t\t" + dannie[i]);
        }
    }
}
