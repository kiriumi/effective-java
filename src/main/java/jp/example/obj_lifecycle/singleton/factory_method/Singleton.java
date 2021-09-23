package jp.example.obj_lifecycle.singleton.factory_method;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return INSTANCE;
    }

    void hello() {
        System.out.println("Hello Singleton");
    }
}
