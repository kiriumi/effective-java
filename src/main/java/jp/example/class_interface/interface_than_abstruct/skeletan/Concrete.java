package jp.example.class_interface.interface_than_abstruct.skeletan;

import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
class Concrete extends AbstractInterface {

    @Getter
    private final String field = "具象クラスのフィールド値";

    @Getter
    private final String concreteField = "フィールド値";

    @Override
    public void start() {
        System.out.println("開始");
    }

    @Override
    public void end() {
        System.out.println("終了");
    }

}
