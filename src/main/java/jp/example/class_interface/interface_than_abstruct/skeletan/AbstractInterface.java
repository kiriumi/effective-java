package jp.example.class_interface.interface_than_abstruct.skeletan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// Objectクラスのメソッドをオーバーライドする場合は、骨格実装する
/**
 *
 * @implSpec
 * start()とend()をオーバーライドして処理を実装すること<br>
 * mainメソッドを実行した際、start() -> end()の順で実行される
 *
 */
@ToString
@EqualsAndHashCode
public abstract class AbstractInterface {

    // フィールドを定義する場合も、骨格実装する
    @Getter
    private final String field = "骨格実装クラスのフィールド値";

    @Getter
    private final String abstractField = "フィールド値";

    protected void main() {
        start();
        end();
    }

    protected abstract void start();

    protected abstract void end();

}
