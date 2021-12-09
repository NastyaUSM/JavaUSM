package cad.lab11.nomer14_7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite predlojenie: ");
        String sentence = scanner.nextLine();
        String translatedLatinSentence = translate(sentence);
        System.out.println(translatedLatinSentence);
    }

    public static String translate(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder tranlatedLatinSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstSymbol = word.charAt(0);
                String translatedWord = word.substring(1) + firstSymbol + "ay";
                tranlatedLatinSentence.append(translatedWord).append(" ");
            }
        }

        return tranlatedLatinSentence.toString().trim();
    }
}
