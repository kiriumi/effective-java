package jp.example.common_obj_method.to_string;

public class Main {

    public static void main(String[] args) {

        final Example hoge = new Example();

        hoge.setNum(1);
        hoge.setStr("変数１");

        final String[] array = hoge.getArray();
        array[0] = "配列要素１";
        array[1] = "配列要素２";

        hoge.getList().add("リスト要素１");
        hoge.getList().add("リスト要素２");

        System.out.println(hoge);
    }

}
