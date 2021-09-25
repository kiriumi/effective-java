package jp.example.class_interface.interface_than_abstruct.static_member_class;

class EnclosingClass {

    private static final String ENCLOSING_CONST = "エンクロージングの定数";
    private final String enclosingField = "エンクロージングのフィールド値";

    void enclosingMethod() {
        System.out.println("エンクロージングのメソッド");
    }

    /**
     * 無名クラス
     *
     * インスタンスが「１メソッド」内の「１箇所のみ」必要な場合使用する
     * ※クラスの定義が長い場合は、メンバークラスにする
     */
    void useNonNameClass() {

        final String tag = "無名クラス";

        final NonName task = () -> {

            System.out.println(tag);

            System.out.println(ENCLOSING_CONST);
            System.out.println(enclosingField);
            enclosingMethod();
        };
        task.hello();
    }

    /**
     * ローカルクラス
     *
     * インスタンスが「１メソッド」内の「複数箇所」必要な場合使用する
     * ※クラスの定義が長い場合は、メンバークラスにする
     */
    void useLocalClass() {

        final String tag = "ローカルクラス：";

        class LocalClass {

            String field = "フィールド値";

            LocalClass(String field) {
                this.field = field;
            }

            void hello() {
                System.out.println(tag + field);

                System.out.println(ENCLOSING_CONST);
                System.out.println(enclosingField);
                enclosingMethod();
            }
        }

        final LocalClass localA = new LocalClass("A");
        localA.hello();

        System.out.println("--------");

        final LocalClass localB = new LocalClass("B");
        localB.hello();
    }

    void useNonStaticClass() {

        final NonStaticMemberClass nonStatic = new NonStaticMemberClass();
        nonStatic.hello();
    }

    /**
     * 非staticなメンバークラス
     *
     * インスタンスが「複数メソッド」で必要かつ「エンクロージングクラスのインスタンスを使う」場合使用する
     * ※本クラスをインスタンス化するとエンクロージングクラスを自動的に参照し、メモリリークを起こす可能性があるので注意
     */
    class NonStaticMemberClass {

        final String tag = "非staticなメンバークラス";

        void hello() {

            System.out.println(tag);

            System.out.println(ENCLOSING_CONST);
            System.out.println(enclosingField);
            enclosingMethod();
        }

    }

    void useStaticClass() {

        final StaticMemberClass staticClass = new StaticMemberClass();
        staticClass.hello();
    }

    /**
     * staticなメンバークラス
     *
     * インスタンスが「複数メソッド」で必要かつ「エンクロージングクラス」のインスタンスを使わない」場合使用する
     *
     */
    static class StaticMemberClass {

        final String tag = "staticなメンバークラス";

        void hello() {

            System.out.println(tag);

            System.out.println(ENCLOSING_CONST);

            // エンクロージングのインスタンスフィールド・メソッドは使用できない
            // System.out.println(enclosingField);
            // enclosingMethod();
        }
    }

}
