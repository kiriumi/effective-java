package jp.example.generics.generic_method.generic_singleton_factory;

import java.util.function.Consumer;

class GenericSingletonFactory {

    // 処理（ラムダ式）をシングルトンで定義
    private static Consumer<Object> IDENTITY_FUNCTION = t -> {
        System.out.println(t);
    };

    // ラムダ式のシングルトンを渡す
    @SuppressWarnings("unchecked")
    public static <T> Consumer<T> identiryFunction() {
        return (Consumer<T>) IDENTITY_FUNCTION;
    }

}
