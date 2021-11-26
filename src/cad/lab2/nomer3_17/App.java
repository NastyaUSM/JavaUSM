package cad.lab2.nomer3_17;

import java.util.Scanner;

/*
В этом упражнении вы разработаете "начальный" класс HealthProfile для человека.
Атрибуты класса должны включать имя, фамилию, пол, дату рождения
(состоящую из отдельных 100 Глава 3 Введение в классы, объекты, методы и строки
атрибутов для месяца, дня и года рождения), рост (в дюймах) и вес (в фунтах).
Ваш класс должен иметь конструктор, который получает эти данные. Для каждого
атрибута предусмотрите методы set и get. Класс также должен включать методы,
которые вычисляют и возвращают возраст пользователя в годах, максимальный пульс
и целевой диапазон пульса (см. упражнение 3.16), а также индекс массы тела
(ИМТ; см. упражнение 2.33). Напишите приложение на Java, которое запрашивает
информацию о человеке, создает объект класса HealthProfile для этого человека
и печатает информацию из этого объекта - имя, фамилию, пол, дату рождения,
рост и вес человека - затем вычисляет и печатает возраст человека в годах, ИМТ,
максимальную частоту сердечных сокращений и целевой диапазон частоты сердечных сокращений.
Он также должен отобразить график значений ИМТ из упражнения 2.33.
 */

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite imia: ");
        String firstName = scanner.next();

        System.out.print("Vvedite familiu: ");
        String lastName = scanner.next();

        System.out.print("Vvedite gender: ");
        String gender = scanner.next();

        System.out.print("Vvedite god rojdenia: ");
        int year = scanner.nextInt();

        System.out.print("Vvedite mesiats rojdenia: ");
        int month = scanner.nextInt();

        System.out.print("Vvedite deni rojdenia: ");
        int day = scanner.nextInt();

        System.out.print("Vvedite vash ves: ");
        double weight = scanner.nextDouble();

        System.out.print("Vvedite vash rost: ");
        double height = scanner.nextDouble();

        HealthProfile healthProfile = new HealthProfile(firstName, lastName, gender, year, month, day, height, weight);

        String description = healthProfile.getFirstName() + " " + healthProfile.getLastName() +
                " is " + healthProfile.getAge() + " years old, maximum heart rate = " +
                healthProfile.getMaximumHeartRate() + ", target heart rate = " +
                healthProfile.getTargetHeartRate() + ", BMI = " +
                healthProfile.getBodyMassIndex() + " -- " +
                healthProfile.getBMIValue();
        System.out.println(description);
    }
}
