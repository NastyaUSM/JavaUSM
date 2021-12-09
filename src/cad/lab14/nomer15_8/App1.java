package cad.lab14.nomer15_8;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> studentPollResponses = new ArrayList<>();

        while (true) {
            System.out.print("Vvedite otvet [exit - 0]: ");
            int response = scanner.nextInt();

            if (response == 0) {
                break;
            }

            studentPollResponses.add(response);
        }

        try (Formatter formatter = new Formatter("D:\\responses.txt")) {

            for (Integer response : studentPollResponses) {
                formatter.format("%d%n", response);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("File bil sozdan i zapolnen!");
    }
}
