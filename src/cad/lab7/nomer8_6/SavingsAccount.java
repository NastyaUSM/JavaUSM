package cad.lab7.nomer8_6;

public class SavingsAccount {
    private static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(float savingsBalance) {
        setSavingsBalance(savingsBalance);
    }

    public static void modifyInterestRate(float newInterestRate) {
        if (newInterestRate >= 0) {
            annualInterestRate = newInterestRate / 100;
        }
    }

    public float getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(float savingsBalance) {
        if (savingsBalance > 0) {
            this.savingsBalance = savingsBalance;
        }
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

}
