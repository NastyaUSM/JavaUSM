package cad.lab2.nomer3_15;

import cad.lab2.nomer3_11.Account;

import java.util.Scanner;

/*
 В классе AccountTest из рис. 3.9 метод main содержит шесть операторов
 (строки 13-14, 15-16, 28-29, 30-31, 40-41 и 42-43), каждый из которых
 отображает имя и баланс объекта Account. Изучите эти утверждения и вы
 заметите, что они отличаются только тем, какой объект Account является
 объектом манипулирования account1 или account2. В этом упражнении вы
 определите новый метод displayAccount, который будет содержать одну копию
 этого выходного утверждения. Параметром метода будет объект Account, а
 метод выведет его имя и баланс. Затем вы замените шесть дублирующихся
 утверждений в main вызовами displayAccount, передавая в качестве аргумента
 конкретный объект Account для вывода. Измените класс AccountTest из рис. 3.9,
 чтобы объявить следующий метод displayAccount после закрывающей правой скобки
 main и перед закрывающей правой скобкой класса AccountTest
 */
public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1’s balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);
    } // end main

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
} // end class AccountTest
