package jp.example.generics.generic_method;

class Example {

    <T> T generics(T value) {
        return value;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    <T, U> Tuple<T, U> generics(T value1, U value2) {
        return new Tuple(value1, value2);
    }
}
