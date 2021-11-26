package cad.lab2.nomer3_11;

/* Модифицируйте класс Account (рис. 3.8), чтобы обеспечить метод withdraw,
который снимает деньги со счета. Убедитесь, что сумма снятия
не превышает баланс счета. Если превышает, то баланс должен быть оставлен без изменений,
 а метод должен вывести сообщение "Сумма снятия превысила баланс счета".
 Измените класс AccountTest (рис. 3.9), чтобы протестировать метод withdraw. */

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50);
        Account account2 = new Account("John Blue", 200);

        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());
        System.out.println("Name of second account is " + account2.getName() + " and balance is " + account2.getBalance());

        System.out.println(" ");

        account1.deposit(10);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

        System.out.println(" ");

        account1.withdraw(90);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

        System.out.println(" ");

        account1.withdraw(-10);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

        System.out.println(" ");

        account1.withdraw(0);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

        System.out.println(" ");

        account1.withdraw(20);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

        System.out.println(" ");

        account1.withdraw(40);
        System.out.println("Name of first account is " + account1.getName() + " and balance is " + account1.getBalance());

    }

}
