package jp.example.common_obj_method.compare.comparable;

import lombok.Value;

@Value
class Person implements Comparable<Person> {

    private String name;
    private int age;

    @Override
    public int compareTo(Person person) {

        if (this.age > person.getAge())
            return 1;

        if (this.age == person.getAge())
            return 0;

        return -1;
    }

}
