package jp.example.class_interface.interface_than_abstruct.skeletan;

public class Main {

    public static void main(String[] args) {

        final Concrete concrete = new Concrete();
        concrete.main();

        System.out.println(concrete.toString());
        System.out.println(concrete.getField()); // 同名のフィールド名：子クラス＞親クラス
    }

}
