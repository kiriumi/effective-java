package jp.example.common_obj_method.clone.copy_constructor;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CopyConstructor {

    @Getter
    @Setter
    private int num;

    @Getter
    @Setter
    private String str;

    @Getter
    private String[] array = new String[3];

    @Getter
    private List<String> list = new ArrayList<>();

    public CopyConstructor() {
    }

    /**
     * コピーコンストラクタ
     * ・プリミティブ型や配列の側だけディープコピーができる
     * ・それ以外はシャローコピーになる
     * @param instance
     */
    public CopyConstructor(CopyConstructor instance) {

        this.num = instance.getNum();
        this.str = new String(instance.getStr());
        this.array = instance.getArray().clone();
        this.list = instance.getList();
    }

}
