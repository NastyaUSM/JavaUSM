package cad.lab3.nomer4_19;

public class SalesCommissionCalculator {

    private double commission = 0.09;
    private double salary = 200;
    private double totalItemsValue;

    public void addItemValue(double itemValue) {
        if (itemValue > 0) {
            totalItemsValue = totalItemsValue + itemValue;
        }
    }

    public void displayEarnings() {
        double earnings = salary + totalItemsValue * commission;
        System.out.println("Prodavets zarabotal vsego: " + earnings);
    }
}
