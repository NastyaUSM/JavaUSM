package cad.lab12.nomer16_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordFrequency = new HashMap<>();

        System.out.print("Vvedite vashe soobshenie: ");
        String sentence = scanner.nextLine();

        String[] splittedWords = sentence.split("[ ,.;]");
        for (String word : splittedWords) {
            if (word.trim().isEmpty()) {
                continue;
            }

            String lowerCaseWord = word.toLowerCase();
            if (wordFrequency.containsKey(lowerCaseWord)) {
                Integer frequency = wordFrequency.get(lowerCaseWord) + 1;
                wordFrequency.replace(lowerCaseWord, frequency);
            } else {
                wordFrequency.put(lowerCaseWord, 1);
            }
        }

        System.out.println("Word\t\t\t\tFrequency");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + "\t\t\t\t" + entry.getValue());
        }
    }
}
