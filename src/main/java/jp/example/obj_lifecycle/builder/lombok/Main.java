package jp.example.obj_lifecycle.builder.lombok;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final Person person = Person.builder().name("ほげ").birthday(LocalDate.of(2000, 4, 1))
                .email("hoge@example.com").sexCode(1).build();

        System.out.println(person);
    }

}
