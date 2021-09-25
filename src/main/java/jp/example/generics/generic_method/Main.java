package jp.example.generics.generic_method;

public class Main {

    public static void main(String[] args) {

        final Example example = new Example();

        System.out.println(example.generics("あいうえお"));
        System.out.println(example.generics(1, "ABCDE"));
    }

}
