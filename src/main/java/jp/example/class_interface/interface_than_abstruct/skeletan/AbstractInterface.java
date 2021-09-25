package jp.example.class_interface.interface_than_abstruct.skeletan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Objectクラスのメソッドをオーバーライドする場合は、骨格実装する
@ToString
@EqualsAndHashCode
public abstract class AbstractInterface {

    // フィールドを定義する場合も、骨格実装する
    @Getter
    @Setter
    private String field;

    protected void main() {
        start();
        end();
    }

    protected abstract void start();

    protected abstract void end();

}
