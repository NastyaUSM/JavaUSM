package cad.lab;

public class Nomer24 {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 6;
        int number3 = 1;
        int number4 = 12;
        int number5 = -8;

        int max;
        int min;

        if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
            max = number2;
        } else if (number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5) {
            max = number3;
        } else if (number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5) {
            max = number4;
        } else {
            max = number5;
        }


        if (number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5) {
            min = number1;
        } else if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5) {
            min = number2;
        } else if (number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5) {
            min = number3;
        } else if (number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5) {
            min = number4;
        } else {
            min = number5;
        }
        System.out.println("Max znacenie = " + max);
        System.out.println("Min znacenie = " + min);
    }
}