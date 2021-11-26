package cad.lab2.nomer3_16;

import java.util.Scanner;

/*
Создайте класс под названием HeartRates. Атрибуты класса должны включать имя,
фамилию и дату рождения человека (состоящую из отдельных атрибутов для месяца,
дня и года рождения). Ваш класс должен иметь конструктор, который получает эти
данные в качестве параметров. Для каждого атрибута предусмотрите методы set и get.
Класс также должен включать метод, который вычисляет и возвращает возраст человека
(в годах), метод, который вычисляет и возвращает максимальный пульс человека, и
метод, который вычисляет и возвращает целевой пульс человека. Напишите приложение
на Java, которое запрашивает информацию о человеке, создает объект класса HeartRates
и печатает информацию из этого объекта, включая имя, фамилию и дату рождения человека,
затем вычисляет и печатает возраст человека в годах, максимальный пульс и целевой
диапазон пульса.
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite imia: ");
        String firstName = scanner.next();

        System.out.print("Vvedite familiu: ");
        String lastName = scanner.next();

        System.out.print("Vvedite god rojdenia: ");
        int year = scanner.nextInt();

        System.out.print("Vvedite mesiats rojdenia: ");
        int month = scanner.nextInt();

        System.out.print("Vvedite deni rojdenia: ");
        int day = scanner.nextInt();

        HeartRates heartRates = new HeartRates(firstName, lastName, year, month, day);

        String description = heartRates.getFirstName() + " " + heartRates.getLastName() +
                " is " + heartRates.getAge() + " years old, maximum heart rate = " +
                heartRates.getMaximumHeartRate() + " and target heart rate = " +
                heartRates.getTargetHeartRate();
        System.out.println(description);
    }
}
