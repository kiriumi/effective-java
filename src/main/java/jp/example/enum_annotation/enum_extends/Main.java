package jp.example.enum_annotation.enum_extends;

public class Main {

    public static void main(String[] args) {

        System.out.println(BasicOperation.PLUS.apply(1, 2));
        System.out.println(ExtendedOperation.TIMES.apply(1, 2));
    }

}
