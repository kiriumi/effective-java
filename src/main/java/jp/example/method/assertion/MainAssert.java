package jp.example.method.assertion;

import java.util.Objects;

public class MainAssert {

    public static void main(String[] args) {

        final long[] longs = new long[5];
        withAssert(longs, -1, 2);

        throw new AssertionError();
    }

    static void hello(String name) {
        Objects.requireNonNull(name);
    }

    private static void withAssert(long longs[], int offset, int length) {

        // 外部公開しない（publicではない）メソッドの場合使用して良い
        // VM引数に「-ea」（-enableassertions）を指定したら動作する
        assert longs != null : "Nullだよ";
        assert 0 <= offset && offset <= longs.length;
        assert 0 < length && length <= longs.length - offset;

        for (final long l : longs) {
            System.out.println(l);
        }

    }
}
