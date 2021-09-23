package jp.example.obj_lifecycle.builder.lombok;

public class Main {

    public static void main(String[] args) {

        final Person person = Person.builder().name("ほげ").email("hoge@example.com").telNo("0120123456").build();
        System.out.println(person);
    }

}
