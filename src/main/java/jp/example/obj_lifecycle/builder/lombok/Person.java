package jp.example.obj_lifecycle.builder.lombok;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
class Person {

    @NonNull
    private final String name;

    @NonNull
    private final String email;

    @Builder.Default
    private final String telNo = "";

    @Builder.Default
    private final String postalCode = "";

}
