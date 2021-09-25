package jp.example.generics.generics.generic_singleton_factory;

import java.util.function.UnaryOperator;

class GenericSingletonFactory {

    // 処理（ラムダ式）をシングルトンで定義
    // ※UnaryOperator：引数と同じ型の戻り値を返すメソッド用の関数型オブジェクト
    private static UnaryOperator<Object> IDENTITY_FUNCTION = t -> {
        System.out.println(t);
        return t;
    };

    // ラムダ式のシングルトンを渡す
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identiryFunction() {
        return (UnaryOperator<T>) IDENTITY_FUNCTION;
    }

}
