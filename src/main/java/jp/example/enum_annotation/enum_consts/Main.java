package jp.example.enum_annotation.enum_consts;

public class Main {

    public static void main(String[] args) {

        // toString()とname()の確認
        // 何もしていないと同じ値（ONE）
        // Lombokの@ToStringを付けると変わるので注意
        // ・toString()：Example.ONE(value=1)
        // ・name()：ONE
        System.out.println(Example.ONE.toString());
        System.out.println(Example.ONE.name());

        // equalsを適切にオーバーライドしてくれているため、適切に評価してくれる
        System.out.println(Example.ONE.equals(Example.ONE)); // true
        System.out.println(Example.ONE.equals(Example.THREE)); // false

        // 序数（ordinal()）の値で比較する
        System.out.println(Example.THREE.compareTo(Example.ONE)); // 3 - 1 = 2
        System.out.println(Example.TWO.compareTo(Example.ONE)); // 2 - 1 = 1

        // values()の確認
        // ・全ての定数を配列で返す
        for (final Example e : Example.values()) {
            System.out.println(e);
        }
        System.out.println(Example.values().length); // 定数の数も分かる

        // valueOfメソッドの動作確認
        // ・引数で指定した名前の定数を取得する
        System.out.println(Example.valueOf("ONE"));

        // 定数のポリモフィズムもできる
        Example.ONE.hello(); // カスタム
        Example.TWO.hello(); // デフォルト

        // switch式にも使える
        switch (Example.values()[0]) {
            case ONE -> System.out.println(1);
            case TWO -> System.out.println(2);
            case THREE -> System.out.println(3);

            default -> throw new IllegalArgumentException("Unexpected value:");
        }

    }
}
