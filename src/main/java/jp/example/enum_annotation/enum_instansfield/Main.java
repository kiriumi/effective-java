package jp.example.enum_annotation.enum_instansfield;

public class Main {

    public static void main(String[] args) {

        System.out.println(ExampleBad.SOLO.number());
        System.out.println(ExampleGood.SOLO.number());

    }

}
