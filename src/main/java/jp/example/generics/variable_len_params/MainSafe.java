package jp.example.generics.variable_len_params;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainSafe {

    public static void main(String[] args) {

        final List<String> attributeList = pickTwoList("Good", "Fast", "Cheap");
    }

    static <T> List<T> pickTwoList(T a, T b, T c) {

        return switch (ThreadLocalRandom.current().nextInt(3)) {

            // 総称配列になっている警告をちゃんと出してくれている
            // ・型の安全性: T の総称配列は可変引数パラメーターに対して作成されます
            case 0 -> toList(a, b);
            case 1 -> toList(b, c);
            case 2 -> toList(c, a);
            default -> throw new IllegalArgumentException(
                    "Unexpected value: " + ThreadLocalRandom.current().nextInt(3));
        };

    }

    @SafeVarargs
    static <T> List<T> toList(T... args) {
        // 総称配列の可変長パラメータをそのまま返さず、別オブジェクト（List<T>）にして利用者に返してる
        return Arrays.asList(args);
    }

    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {

        final List<T> result = new ArrayList<>();
        for (final List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

}
