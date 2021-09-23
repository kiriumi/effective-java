package jp.example.common_obj_method.compare.comparator_builder;

import java.util.Comparator;

import lombok.Value;

@Value
class Person implements Comparable<Person> {

    private String name;
    private int age;

    private static final Comparator<Person> COMPARATOR = Comparator
            .comparingInt((Person person) -> person.getAge())
            .thenComparing((Person person) -> person.getName());

    @Override
    public int compareTo(Person person) {
        return COMPARATOR.compare(this, person);
    }

}
