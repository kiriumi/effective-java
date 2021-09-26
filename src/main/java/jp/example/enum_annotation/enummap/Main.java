package jp.example.enum_annotation.enummap;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.example.enum_annotation.enummap.Student.Gread;

public class Main {

    public static void main(String[] args) {

        // 準備：生徒の用意
        final Set<Student> first = new HashSet<>();
        first.add(new Student("一郎", Gread.FIRST));
        first.add(new Student("壱子", Gread.FIRST));

        final Set<Student> second = new HashSet<>();
        first.add(new Student("二郎", Gread.SECOND));
        first.add(new Student("弐子", Gread.SECOND));

        final Set<Student> third = new HashSet<>();
        first.add(new Student("三郎", Gread.THIRD));
        first.add(new Student("参子", Gread.THIRD));

        // ----------------

        // NG：ordinal()をキーにしている
        final Set<Student>[] SutudentArray = new Set[Student.Gread.values().length];
        SutudentArray[Gread.FIRST.ordinal()] = first;
        SutudentArray[Gread.SECOND.ordinal()] = second;
        SutudentArray[Gread.THIRD.ordinal()] = third;

        // OK：EnumMapを使っている
        final Map<Student.Gread, Set<Student>> SutudentMap = new EnumMap<>(Student.Gread.class);
        SutudentMap.put(Gread.FIRST, first);
        SutudentMap.put(Gread.SECOND, second);
        SutudentMap.put(Gread.THIRD, third);

    }

}
