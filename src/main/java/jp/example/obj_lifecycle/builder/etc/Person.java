package jp.example.obj_lifecycle.builder.etc;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {

    private final String name;
    private final LocalDate birthday;

    private int sexCode = 0;
    private String email = "";
    private String tel = "";
    private String addressNum = "";

    public Person sexCode(int sexCode) {
        this.sexCode = sexCode;
        return this;
    }

    public Person email(String email) {
        this.email = email;
        return this;
    }

    public Person tel(String tel) {
        this.tel = tel;
        return this;
    }

    public Person addressNum(String addressNum) {
        this.addressNum = addressNum;
        return this;
    }
}
