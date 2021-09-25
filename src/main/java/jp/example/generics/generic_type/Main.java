package jp.example.generics.generic_type;

public class Main {

    public static void main(String[] args) {

        final GenericsClass<Example> genericsClass = new GenericsClass<>();
        genericsClass.hello(new Example());
        genericsClass.number(1);

    }

}
