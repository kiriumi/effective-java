package jp.example.class_interface.interface_than_abstruct.interface_default;

interface ImplSupport {

    // public static final と同じ扱い
    String CONST = "定数";

    default void main() {
        start();
        end();
    }

    void start();

    void end();

    static void util() {
        System.out.println();
    }

    //    Objectクラスのメソッドはデフォルトで定義できない
    //    default boolean equals(Object obj) {
    //    }

}
