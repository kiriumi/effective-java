package jp.example.obj_lifecycle.builder.javabeans;

public class Main {

    public static void main(String[] args) {

        final Person person = new Person("名前", "hoge@example.com").telNo("0120123456");
        System.out.println(person);
    }

}
