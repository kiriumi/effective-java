package jp.example.lambda_stream.method_ref;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args) {

        // static
        final Consumer<String> staticMethod = System.out::println;
        staticMethod.accept("あいうえお");

        // アンバウンド
        final Function<String, String> unbound = String::toLowerCase;
        System.out.println(unbound.apply("ABCDE"));

        // クラスコンストラクタ
        final Function<String, BigDecimal> classConstructor = BigDecimal::new;
        final BigDecimal decimal = classConstructor.apply("10.01");
        System.out.println(decimal);

        // 配列コンストラクタ
        final IntFunction<String[]> arrayConstructor = String[]::new;
        System.out.println(arrayConstructor.apply(10));

    }

}
