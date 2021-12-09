package cad.lab7.nomer8_6;

public class App {

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(2000);
        SavingsAccount acc2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Procentnaia stavka 4%");
        System.out.println("N\tBalance accounta 1\tBalance accounta 2");
        for (int i = 0; i < 13; i++) {
            if (i == 12) {
                SavingsAccount.modifyInterestRate(5);
                System.out.println("Procentnaia stavka 5%");
            }
            acc1.calculateMonthlyInterest();
            acc2.calculateMonthlyInterest();
            System.out.printf("%d\t%.2f\t\t%.2f%n", i + 1, acc1.getSavingsBalance(), acc2.getSavingsBalance());
        }
    }
}
