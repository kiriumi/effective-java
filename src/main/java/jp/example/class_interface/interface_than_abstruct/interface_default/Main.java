package jp.example.class_interface.interface_than_abstruct.interface_default;

public class Main {

    public static void main(String[] args) {

        final Concrete concrete = new Concrete();
        concrete.main();

        // 定数はインターフェース、具象クラスのどちらからでもアクセスできる
        System.out.println(ImplSupport.CONST);
        System.out.println(Concrete.CONST);

        // 静的メソッドはインターフェースからのみアクセスできる
        ImplSupport.util();
        // Concrete.util(); コレはできない
    }

}
