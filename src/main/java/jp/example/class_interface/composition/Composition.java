package jp.example.class_interface.composition;

import jp.example.class_interface.composition.caution.ExampleImpl;

public class Composition {

    private final ExampleImpl obj = new ExampleImpl();

    public void hello() {
        obj.hello();
    }
}
