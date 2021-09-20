package jp.example.obj_lifecycle.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final Person person = new Person.Builder("ほげ", LocalDate.of(2000, 4, 1))
                .email("hoge@example.com")
                .tel("0120123456").build();

        System.out.println(person);
    }

}
