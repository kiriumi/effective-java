package jp.example.class_interface.interface_than_abstruct.static_member_class;

public class Main {

    public static void main(String[] args) {

        final EnclosingClass obj = new EnclosingClass();

        obj.useNonNameClass();
        System.out.println("----------------");

        obj.useLocalClass();
        System.out.println("----------------");

        obj.useNonStaticClass();
        System.out.println("----------------");

        obj.useStaticClass();
    }
}
