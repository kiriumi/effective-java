package jp.example.obj_lifecycle.builder;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Person {

    private final String name;
    private final LocalDate birthday;
    private int sexCode = 0;
    private final String email;
    private final String tel;
    private final String addressNum;

    private Person(Builder builder) {

        this.name = builder.name;
        this.birthday = builder.birthday;
        this.sexCode = builder.sexCode;
        this.email = builder.email;
        this.tel = builder.tel;
        this.addressNum = builder.addressNum;
    }

    public static class Builder {

        private final String name;
        private final LocalDate birthday;

        public Builder(String name, LocalDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        private int sexCode = 0;
        private String email = "";
        private String tel = "";
        private String addressNum = "";

        public Builder sexCode(int sexCode) {
            this.sexCode = sexCode;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder tel(String tel) {
            this.tel = tel;
            return this;
        }

        public Builder addressNum(String addressNum) {
            this.addressNum = addressNum;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}
