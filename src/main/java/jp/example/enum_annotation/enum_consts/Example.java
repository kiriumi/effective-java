package jp.example.enum_annotation.enum_consts;

import lombok.ToString;

@ToString
enum Example implements Interface, Interface2 {

    // 匿名クラスでメソッドをオーバーライドし、ポリモフィズムを実現できる
    ONE(1) {
        // オーバーライドし固有の処理を実装できる
        @Override
        void hello() {
            System.out.println("カスタム");
        }

        @Override
        public void interfaceMethod() {
        }

        @Override
        void abstractMethod() {
        }
    },

    TWO(2) {
        @Override
        void abstractMethod() {
        }

        @Override
        public void interfaceMethod() {
        }
    },

    THREE(3) {
        @Override
        void abstractMethod() {
        }

        @Override
        public void interfaceMethod() {
        }
    };

    // フィールド
    int value;

    // コンストラクタ
    Example(int value) {
        this.value = value;
    }

    // メソッド
    void hello() {
        System.out.println("デフォルト");
    }

    // 抽象メソッドを作り、個々の定数に実装を強制できる
    abstract void abstractMethod();

    @Override
    public void interfaceMethod2() {
        // ここで実装すれば、すべての定数に反映
    }

}
