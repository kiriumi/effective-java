package jp.example.generics.generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        final Example example = new Example();

        final List<?> list = example.numberList();
        final List<? super Integer> integerList = example.numberList();
        final List<? extends Number> numberList = example.numberList();

        final List<?> wildcardList = example.wildcardList();
        final List<?> genericsList = example.genericsList(List.of("文字列１", "文字列２"));

        // ↓はできない
        // List<Number> aaa = normalClass.wildcardList();
        // List<? super Integer> bbb = normalClass.wildcardList();
        // List<? extends Number> ccc = normalClass.wildcardList();

        final GenericsClass<SubClass> genericsClass = new GenericsClass<>();
        genericsClass.hello(new SubClass());
        genericsClass.number(1);

    }

}
