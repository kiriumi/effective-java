package jp.example.class_interface.composition.caution;

public class ExampleImpl implements Example {

    @Override
    public Example instance() {
        return this;
    }

    @Override
    public void hello() {
        System.out.println("実装クラス");
    }
}
