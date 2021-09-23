package jp.example.common_obj_method.equals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
class DeepCopy implements Serializable {

    @Getter
    @Setter
    private int num;

    @Getter
    @Setter
    private String str;

    @Getter
    private final String[] array = new String[3];

    @Getter
    private final List<String> list = new ArrayList<>();
}
