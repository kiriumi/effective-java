package jp.example.generics.boundaly_wildcard;

import java.util.Arrays;
import java.util.List;

public class Example {

    // 型パラメータがメソッド宣言中に１度しか現れないなら、ワイルドカードを使用する
    // OK
    void ok1(List<?> list) {
        list.clear();
    }

    // ２つ以上パラメータが使われているのでOK
    <T> T ok2(List<T> list) {
        return list.get(0);
    }

    // NG
    <T> void ng(List<T> list) {
        list.clear();
    }

    <T extends Number> List<T> numberList(@SuppressWarnings("unchecked") T... value) {
        return Arrays.asList(value);
    }

    // 戻り値の型として境界ワイルドカード型は使用しない
    // ∵APIの利用者がワイルドカード型を使うことを強制してしまう
    List<? extends Number> ngNumberList() {
        return List.of(1, 2, 3);
    }
}
