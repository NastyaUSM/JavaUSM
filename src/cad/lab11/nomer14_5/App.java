package cad.lab11.nomer14_5;

public class App {

    public static void main(String[] args) {
        SentenceGenerator generator = new SentenceGenerator();
        for (int i = 0; i < 20; i++) {
            String sentence = generator.getSentence();
            if (i == 19) {
                String firstSymbol = sentence.charAt(0) + "";
                sentence = sentence.replaceFirst(firstSymbol, firstSymbol.toUpperCase());
                sentence = sentence + ".";
            }

            System.out.println((i + 1) + ") " + sentence);
        }
    }
}
