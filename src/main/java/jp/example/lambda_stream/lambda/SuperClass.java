package jp.example.lambda_stream.lambda;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

abstract class SuperClass implements Serializable {

    @Getter
    @Setter
    private String field;

    SuperClass(String field) {
        this.field = field;
    }

    abstract void hello();

    abstract void goodNight();

}
