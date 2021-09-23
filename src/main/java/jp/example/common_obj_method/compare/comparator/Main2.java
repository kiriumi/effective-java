package jp.example.common_obj_method.compare.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    private static final Comparator<Person> COMPARATOR = Comparator
            .comparingInt((Person person) -> person.getAge())
            .thenComparing((Person person) -> person.getName());

    public static void main(String[] args) {

        final Person base = new Person("あ", 20);
        final Person adult = new Person("い", 30);
        final Person younger = new Person("う", 20);
        final Person child = new Person("え", 10);

        final List<Person> persons = Arrays.asList(base, adult, younger, child);
        persons.forEach(System.out::println);

        System.out.println("----------------");

        persons.sort(COMPARATOR);

        persons.forEach(System.out::println);
    }
}
