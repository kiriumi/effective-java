package jp.example.obj_lifecycle.inject;

import java.util.List;
import java.util.Objects;

public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return dictionary.hasWord(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.getWords(typo);

    }

}
