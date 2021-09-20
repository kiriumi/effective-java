package jp.example.obj_lifecycle.builder.lombok;

import java.time.LocalDate;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
public class Person {

    @NonNull
    private final String name;

    @NonNull
    private final LocalDate birthday;

    @Builder.Default
    private final int sexCode = 0;

    @Builder.Default
    private final String email = "";

    @Builder.Default
    private final String tel = "";

    @Builder.Default
    private final String addressNum = "";

}
