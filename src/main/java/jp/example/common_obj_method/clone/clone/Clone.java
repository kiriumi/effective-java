package jp.example.common_obj_method.clone.clone;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Clone implements Cloneable {

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

    /**
     * クローンメソッド実装のお作法
     * ・publicでClonable#cloneメソッドをオーバーライドし、super.clone()を返す
     * ・シャローコピーであり、ディープコピーではない
     */
    @Override
    public Clone clone() throws CloneNotSupportedException {
        return (Clone) super.clone();

    }
}
