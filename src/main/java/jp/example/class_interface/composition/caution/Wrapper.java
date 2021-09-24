package jp.example.class_interface.composition.caution;

public class Wrapper implements Example {

    private final Example obj;

    public Wrapper(Example obj) {
        this.obj = obj;
    }

    @Override
    public Example instance() {
        return obj.instance(); // 実装クラスのインスタンスを渡す
    }

    @Override
    public void hello() {
        System.out.println("ラップクラス");
        obj.hello();
    }

}
