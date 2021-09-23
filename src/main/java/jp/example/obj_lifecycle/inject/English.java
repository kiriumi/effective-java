package jp.example.obj_lifecycle.inject;

import java.util.ArrayList;
import java.util.List;

public class English implements Lexicon {

    private final List<String> words = List.of("hoge", "foo", "bar");

    @Override
    public boolean hasWord(String ward) {
        return words.contains(ward);
    }

    @Override
    public List<String> getWords(String typo) {

        final List<String> hitWords = new ArrayList<>();

        words.forEach(word -> {
            if (word.contains(typo)) {
                hitWords.add(typo);
            }
        });

        return hitWords;
    }

}
