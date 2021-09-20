package jp.example.common_obj_method.clone.deepcopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class DeepCopy implements Serializable {

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
