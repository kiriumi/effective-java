package jp.example.obj_lifecycle.inject;

public class Main {

    public static void main(String[] args) {

        final SpellChecker enChecker = new SpellChecker(new English());
        System.out.println(enChecker.isValid("hoge"));
        enChecker.suggestions("h").forEach(System.out::println);

        final SpellChecker jaChecker = new SpellChecker(new Japanese());
        System.out.println(jaChecker.isValid("ほげ"));
        jaChecker.suggestions("ほげ").forEach(System.out::println);
    }
}
