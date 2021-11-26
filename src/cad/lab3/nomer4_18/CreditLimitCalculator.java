package cad.lab3.nomer4_18;

public class CreditLimitCalculator {

    private int accountNumber;
    private int balance;
    private int charges;
    private int credits;
    private int creditLimit;

    public CreditLimitCalculator(int accountNumber, int balance, int charges, int credits, int creditLimit) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
        if (balance > 0) {
            this.balance = balance;
        }
        if (charges > 0) {
            this.charges = charges;
        }
        if (credits > 0) {
            this.credits = credits;
        }
        if (creditLimit > 0) {
            this.creditLimit = creditLimit;
        }
    }

    public void calculateBalance() {
        int newBalance = balance + charges - credits;
        if (newBalance < creditLimit) {
            System.out.println("Credit limit exceeded!");
        } else {
            System.out.println("Your balance is: " + newBalance);
        }
    }
}
