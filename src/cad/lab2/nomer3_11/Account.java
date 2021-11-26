package cad.lab2.nomer3_11;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double dopolnitelinaiaSummaDeneg) {
        if (dopolnitelinaiaSummaDeneg > 0.0) {
            String depositMessage = "Final balance after deposit = " + balance + " + " + dopolnitelinaiaSummaDeneg + " = ";
            balance = balance + dopolnitelinaiaSummaDeneg;
            System.out.println(depositMessage + balance);
        }
    }

    public void withdraw(double sniatieNalicinih) {
        if (sniatieNalicinih >= 0 && sniatieNalicinih <= balance) {
            String withdrawMessage = "Final balance after withdraw = " + balance + " - " + sniatieNalicinih + " = ";
            balance = balance - sniatieNalicinih;
            System.out.println(withdrawMessage + balance);
        } else if (sniatieNalicinih < 0) {
            System.out.println("Vivod sredstv nevozmojen dlia otritatelinih chisel");
        } else if (sniatieNalicinih > balance) {
            System.out.println("Сумма снятия превысила баланс счета");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
