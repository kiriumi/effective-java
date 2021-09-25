package jp.example.generics.generic_method;

final record Tuple<T, U> (T value1, U value2) {

    void hello() {
        System.out.println(value1);
        System.out.println(value2);
    }
}
