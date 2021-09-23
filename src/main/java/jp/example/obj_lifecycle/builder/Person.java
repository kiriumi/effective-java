package jp.example.obj_lifecycle.builder;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
class Person {

    private final String name;
    private final String email;
    private final String telNo;
    private final String postalCode;
    private final String region;
    private final String locality;

    private Person(Builder builder) {

        this.name = builder.name;
        this.email = builder.email;
        this.telNo = builder.telNo;
        this.postalCode = builder.postalCode;
        this.region = builder.region;
        this.locality = builder.locality;
    }

    public static class Builder {

        private final String name;
        private final String email;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        private String telNo = "";
        private String postalCode = "";
        private String region = "";
        private String locality = "";

        public Builder telNo(String telNo) {
            this.telNo = telNo;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder locality(String locality) {
            this.locality = locality;
            return this;
        }

        public Person build() {

            if (!postalCode.isBlank() &&
                    (region.isBlank() || locality.isBlank()))
                throw new IllegalStateException();

            return new Person(this);
        }

    }

}
