package jp.example.generics.variable_len_params;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainDengerous {

    public static void main(String[] args) {

        // ClassCastExceptionが発生する
        // ・toArrayメソッドの戻り値の型は「Object[]」
        // ・attributeがString[]のためObjectからStringにキャストしようとする
        // ・しかしStringはObjectのスーパークラスではないため、キャストできずに異常終了する
        final String[] attribute = pickTwo("Good", "Fast", "Cheap");

        // ∴他のメソッドにジェネリック可変長パラメータの配列へアクセスさせるのは危険
    }

    static <T> T[] pickTwo(T a, T b, T c) {

        return switch (ThreadLocalRandom.current().nextInt(3)) {

            // 総称配列になっている警告をちゃんと出してくれている
            // ・型の安全性: T の総称配列は可変引数パラメーターに対して作成されます
            case 0 -> toArray(a, b);
            case 1 -> toArray(b, c);
            case 2 -> toArray(c, a);
            default -> throw new IllegalArgumentException(
                    "Unexpected value: " + ThreadLocalRandom.current().nextInt(3));
        };

    }

    static <T> T[] toArray(T... args) {

        // 総称配列になっている警告をちゃんと出してくれている
        // ・型の安全性: 可変引数パラメーター args 経由の潜在的なヒープ汚染
        return args; // 引数argsの型はObject[]である
    }

    // ----------------

    static void compileError() {

        // 総称配列のためコンパイルエラーになる
        //        final List<String>[] stringLists = new List<String>[1];
        //        final List<Integer> intList = List.of(42);
        //        final Object[] objects = stringLists;
        //        objects[0] = intList;
        //        final String s = stringLists[0].get(0);
    }

    static void dangerous(List<String>... stringLists) {

        // 引数が総称配列にも関わらずコンパイルエラーにならない
        final List<Integer> intList = List.of(42);
        final Object[] objects = stringLists;
        objects[0] = intList; // ヒープ汚染
        final String str = stringLists[0].get(0); // ClassCastExceptionが発生
    }
}
