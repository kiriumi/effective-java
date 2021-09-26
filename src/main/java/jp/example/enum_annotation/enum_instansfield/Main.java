package jp.example.enum_annotation.enum_instansfield;

public class Main {

    public static void main(String[] args) {

        // 序数を使用した場合
        System.out.println(ExampleBad.SOLO.number());

        // インスタンスフィールドを使用した場合
        System.out.println(ExampleGood.SOLO.number());

    }

}
