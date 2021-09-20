package jp.example.common_obj_method.compare.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final Person base = new Person("基本", 20);
        final Person adult = new Person("大人", 30);
        final Person younger = new Person("若者", 20);
        final Person child = new Person("子供", 10);

        System.out.println(base.compareTo(adult)); // 1
        System.out.println(base.compareTo(younger)); // 0
        System.out.println(base.compareTo(child)); // -1

        System.out.println("----------------");

        final Person[] persons = {
                base,
                adult,
                younger,
                child
        };

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        System.out.println("----------------");

        Arrays.sort(persons);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}
