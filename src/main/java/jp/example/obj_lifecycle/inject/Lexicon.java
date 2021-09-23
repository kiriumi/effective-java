package jp.example.obj_lifecycle.inject;

import java.util.List;

public interface Lexicon {

    boolean hasWord(String ward);

    List<String> getWords(String typo);

}
