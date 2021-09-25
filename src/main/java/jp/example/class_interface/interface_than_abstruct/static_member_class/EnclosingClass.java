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
     * インターフェースや抽象クラスの抽象メソッドを、その場限りの実装をする場合、使用する
     * ※クラスの定義が長い場合は、メンバークラスにする
     */
    void useNonNameClass() {

        final String tag = "無名クラス：";

        final NonName nonName = new NonName() {

            static String staticField = "staticフィールド値";
            String field = "フィールド値";

            @Override
            void hello() {

                System.out.println(tag + field);
                System.out.println(tag + staticField);

                System.out.println(ENCLOSING_CONST);
                System.out.println(enclosingField);
                enclosingMethod();
            }

        };
        nonName.hello();
    }

    /**
     * ローカルクラス
     *
     * １メソッド内でのみ使用するクラスが欲しい場合、使用する
     * ※クラスの定義が長い場合は、メンバークラスにする
     */
    void useLocalClass() {

        final String tag = "ローカルクラス：";

        class LocalClass {

            static String staticField = "staticフィールド値";
            String field = "フィールド値";

            LocalClass(String field) {
                this.field = field;
            }

            void hello() {

                System.out.println(tag + field + "のフィールド値");
                System.out.println(tag + staticField);

                System.out.println(ENCLOSING_CONST);
                System.out.println(enclosingField);
                enclosingMethod();
            }

            static void helloStatic() {
                System.out.println("静的メソッド");

                // ↓はインスタンスメンバーのため使用できない
                // System.out.println(field);
                // System.out.println(enclosingField);
                // enclosingMethod();
            }
        }

        final LocalClass localA = new LocalClass("A");
        localA.hello();
        LocalClass.helloStatic();

        System.out.println("--------");

        final LocalClass localB = new LocalClass("B");
        localB.hello();
        LocalClass.helloStatic();
    }

    void useNonStaticClass() {

        final NonStaticMemberClass nonStatic = new NonStaticMemberClass();
        nonStatic.hello();
        NonStaticMemberClass.helloStatic();
    }

    /**
     * 非staticなメンバークラス
     *
     * インスタンスを「複数メソッド」で使用かつ「エンクロージングクラスのインスタンスを使う」場合、使用する
     * ※本クラスをインスタンス化するとエンクロージングクラスを自動的に参照し、メモリリークを起こす可能性があるので注意
     */
    class NonStaticMemberClass {

        static String staticField = "staticフィールド値";
        final String tag = "非staticなメンバークラス：";

        void hello() {

            System.out.println(tag);
            System.out.println(tag + staticField);

            System.out.println(ENCLOSING_CONST);
            System.out.println(enclosingField);
            enclosingMethod();
        }

        static void helloStatic() {
            System.out.println("静的メソッド");

            // ↓はインスタンスメンバーのため使用できない
            // System.out.println(field);
            // System.out.println(enclosingField);
            // enclosingMethod();
        }

    }

    void useStaticClass() {

        final StaticMemberClass staticClass = new StaticMemberClass();
        staticClass.hello();
        StaticMemberClass.helloStatic();
    }

    /**
     * staticなメンバークラス
     *
     * インスタンスを「複数メソッド」で使用かつ「エンクロージングクラスのインスタンスを使わない」場合、使用する
     *
     */
    static class StaticMemberClass {

        static String staticField = "staticフィールド値";
        final String tag = "staticなメンバークラス：";

        void hello() {

            System.out.println(tag);
            System.out.println(tag + staticField);

            System.out.println(ENCLOSING_CONST);

            // エンクロージングのインスタンスメンバーは使用できない
            // System.out.println(enclosingField);
            // enclosingMethod();
        }

        static void helloStatic() {
            System.out.println("静的メソッド");

            // ↓はインスタンスメンバーのため使用できない
            // System.out.println(field);
        }
    }

}
