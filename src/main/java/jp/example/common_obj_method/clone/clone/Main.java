package jp.example.common_obj_method.clone.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        final Clone from = new Clone();

        from.setNum(1);
        from.setStr("変数１");

        final String[] array = from.getArray();
        array[0] = "配列要素１";
        array[1] = "配列要素２";

        from.getList().add("リスト要素１");
        from.getList().add("リスト要素２");

        final Clone to = from.clone();
        System.out.println(to.getNum());
        System.out.println(to.getStr());
        System.out.println(to.getArray()[0]);
        System.out.println(to.getArray()[1]);
        System.out.println(to.getList().get(0));
        System.out.println(to.getList().get(1));
    }

}
