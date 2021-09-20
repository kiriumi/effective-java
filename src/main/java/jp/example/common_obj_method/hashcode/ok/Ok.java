package jp.example.common_obj_method.hashcode.ok;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * equalsとともにhashCodeもオーバーライド
 *
 */
@ToString
@EqualsAndHashCode
public class Ok implements Serializable {

    @Getter
    private final String name;

    @Getter
    private final int age;

    public Ok(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
