package jp.example.generics.boundaly_wildcard;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        final Example example = new Example();

        // 適切な（ジェネリクス型）受け取り方
        // ∵APIの利用者自身がどんな型を扱ってるかすぐに分かる
        final List<Number> generics = example.numberList();

        // 不適切な（ワイルドカード型）受け取り方
        // ∵APIの利用者自身がどんな型を扱ってるか分からない
        final List<?> list = example.numberList();
        final List<? super Integer> integerList = example.numberList();
        final List<? extends Number> numberList = example.numberList();

        // 戻り値の型として境界ワイルドカード型を使用されたAPIの場合
        // キャスト／ワイルドカード型で受け取ることを強制されてしまう
        final List<Number> ngNumberList1 = (List<Number>) example.ngNumberList();
        final List<?> ngNumberList2 = example.ngNumberList();
        final List<? extends Number> ngNumberList3 = example.ngNumberList();

    }

}
