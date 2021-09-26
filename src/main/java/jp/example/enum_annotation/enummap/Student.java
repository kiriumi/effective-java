package jp.example.enum_annotation.enummap;

import lombok.ToString;

@ToString
class Student {

    enum Gread {
        FIRST, SECOND, THIRD
    }

    final String name;
    final Gread gread;

    Student(String name, Gread gread) {
        this.name = name;
        this.gread = gread;
    }

}
