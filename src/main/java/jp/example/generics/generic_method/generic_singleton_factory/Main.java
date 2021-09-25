package jp.example.generics.generic_method.generic_singleton_factory;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // ジェネリック・シングルトン・ファクトリーとは
        // 任意の型で実行できる処理（ラムダ式）をstaticファクトリーで提供する

        final List<String> strings = List.of("ほげ", "ふー", "ばー");
        final Consumer<String> sameString = GenericSingletonFactory.identiryFunction();
        strings.forEach(sameString::accept);

        final List<Number> numbers = List.of(1, 2, 3);
        final Consumer<Number> sameNumber = GenericSingletonFactory.identiryFunction();
        numbers.forEach(sameNumber::accept);

    }

}
