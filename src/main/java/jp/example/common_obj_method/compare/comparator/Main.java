package jp.example.common_obj_method.compare.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final Comparator<Person> COMPARATOR = (person1, person2) -> {

        if (person1.getAge() > person2.getAge())
            return 1;

        if (person1.getAge() == person2.getAge())
            return 0;

        return -1;
    };

    public static void main(String[] args) {

        final Person base = new Person("基本", 20);
        final Person adult = new Person("大人", 30);
        final Person younger = new Person("若者", 20);
        final Person child = new Person("子供", 10);

        final List<Person> persons = Arrays.asList(base, adult, younger, child);
        persons.forEach(System.out::println);

        System.out.println("----------------");

        persons.sort(COMPARATOR);

        persons.forEach(System.out::println);

    }
}
