package jp.example.generics.generics.recursive;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        final Person person = max(List.of(new Person("子供", 10), new Person("若者", 20), new Person("大人", 30)));
        System.out.println(person);
    }

    // 再帰型境界
    public static <E extends Comparable<E>> E max(Collection<E> collect) {

        if (collect.isEmpty())
            throw new IllegalArgumentException();

        E result = null;

        for (final E elem : collect) {
            if (result == null || elem.compareTo(result) > 0) {
                result = Objects.requireNonNull(elem);
            }
        }

        // ラムダ式から、ラムダ式の外側の変数（外部参照）の値を変えることは出来ない
        // collect.forEach(elem -> {
        //    if (result == null || elem.compareTo(result) > 0) {
        //        result = Objects.requireNonNull(elem);
        //    }
        // );

        return result;

    }

}
