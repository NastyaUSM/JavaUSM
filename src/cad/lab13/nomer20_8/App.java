package cad.lab13.nomer20_8;

public class App {

    public static void main(String[] args) {
        Pair<String, Integer> wordToLetters = new Pair<>();

        System.out.println("First - " + wordToLetters.getFirst() + " : Second - " + wordToLetters.getSecond());

        String word = "Hello";
        wordToLetters = new Pair<>(word, word.length());

        System.out.println("First - " + wordToLetters.getFirst() + " : Second - " + wordToLetters.getSecond());
    }
}
