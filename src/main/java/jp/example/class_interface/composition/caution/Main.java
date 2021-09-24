package jp.example.class_interface.composition.caution;

public class Main {

    public static void main(String[] args) {

        final Example example = new Wrapper(new ExampleImpl());
        example.instance().hello(); // ラッパークラスのhelloが実行されない
    }

}
