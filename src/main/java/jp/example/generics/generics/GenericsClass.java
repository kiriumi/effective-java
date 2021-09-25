package jp.example.generics.generics;

import java.util.List;

class GenericsClass<T extends SupperClass> {

    private T field;
    private T[] array;
    private List<T> list;

    public T hello(T value) {
        return value;
    }

    // クラスで宣言した型とは別の型が使用できる
    public <U extends Number> U number(U value) {
        return value;
    }

}
