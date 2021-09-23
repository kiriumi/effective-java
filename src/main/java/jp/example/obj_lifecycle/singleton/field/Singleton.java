package jp.example.obj_lifecycle.singleton.field;

class Singleton {

    static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    void hello() {
        System.out.println("Hello Singleton");
    }
}
