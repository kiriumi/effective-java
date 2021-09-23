package jp.example.obj_lifecycle.builder.javabeans;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final Person person = new Person("ほげ", LocalDate.of(2000, 4, 1)).email("hoge@example.com").tel("0120123456");

        System.out.println(person);
    }

}
