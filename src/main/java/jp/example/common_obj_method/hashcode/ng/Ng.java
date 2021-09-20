package jp.example.common_obj_method.hashcode.ng;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

/**
 * equalsのみオーバーライド
 *
 */
@ToString
public class Ng implements Serializable {

    @Getter
    private final String name;

    @Getter
    private final int age;

    public Ng(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;

        if (!(obj instanceof final Ng ng))
            return false;

        return name.equals(ng.getName()) && (age == ng.getAge());
    }
}
