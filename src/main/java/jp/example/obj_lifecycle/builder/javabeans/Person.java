package jp.example.obj_lifecycle.builder.javabeans;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
class Person {

    private final String name;
    private final String email;

    private String telNo = "";
    private String postalCode = "";

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person telNo(String telNo) {
        this.telNo = telNo;
        return this;
    }

    public Person postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

}
