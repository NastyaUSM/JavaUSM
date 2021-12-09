package cad.lab11.nomer14_5;

import java.util.Random;

public class SentenceGenerator {

    private String[] article;
    private String[] noun;
    private String[] verb;
    private String[] preposition;

    public SentenceGenerator() {
        article = new String[]{"the", "a", "one", "some", "any"};
        noun = new String[]{"boy", "girl", "dog", "town", "car"};
        verb = new String[]{"drove", "ran", "walked", "skipped"};
        preposition = new String[]{"to", "from", "over", "under", "on"};
    }

    public String getSentence() {
        String format = "%s %s %s %s %s %s";
        return String.format(format, getRandom(article), getRandom(noun), getRandom(verb), getRandom(preposition),
                getRandom(article), getRandom(noun));
    }

    private String getRandom(String[] values) {
        int index = new Random().nextInt(values.length);
        return values[index];
    }
}
