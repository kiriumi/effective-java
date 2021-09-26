package jp.example.method.javadoc;

import jp.example.method.javadoc.link.Link;

/**
 * 継承して良いクラス.
 *
 * @author kiriumi
 * @see Link
 *
 * @implSpec start()とend()をオーバーライドすること<br>
 * apiメソッドを実行するとstart() -> {@link Link#link()} -> end() の順で実行する<br>
 * apiメソッドを実行した後はコンソールに完了を示すログが出力される<br>
 *
 */
abstract class Example {

    /**
     * 概要.<br>
     * ・事前条件：なし<br>
     * ・事後条件：なし<br>
     * ・不変条件：なし<br>
     *
     * @param param1 パラメータ１
     * @param param2 パラメータ２
     * @return 戻り値
     * @throws IllegalArgumentException 引数違反例外
     *
     * @see #start()
     * @see #end()
     * @see Link#link()
     *
     * @apiNote APIの注意事項
     */
    public String api(String param1, String param2) throws IllegalArgumentException {
        start();
        new Link().link();
        end();
        return null;
    }

    /**
     * 開始メソッド.
     *
     * @see #api(String, String)
     *
     * @implSpec 実装要件
     * @implNote 実装上の注意
     */
    protected abstract void start();

    /**
     * 終了メソッド.
     *
     * @see #api(String, String)
     *
     * @implSpec 実装要件
     * @implNote 実装上の注意
     */
    protected abstract void end();

    // “最初の文”の判断は、最初のピリオド「.」＋空白文字（改行やブランク）が来る、あるいは最初のブロックタグ（@paramなど）まで
    /**
     * 概要.<br>
     *
     * <h1 style="color: blue">見出し</h1>
     * <p>段落</p>
     * <b>太文字</b><i>イタリック</i><br>
     *
     * <table>
     *    <tr><th>ヘッダ１</th><th>ヘッダ２</th></tr>
     *    <tr><td>ほげ</td><td>ふが</td></tr>
     *    <tr><td>ふー</td><td>ばー</td></tr>
     * </table>
     *
     * {@code System.out.println()} を実装している<br>
     * {@literal <br> } といった特殊な文字が使用できるよ<br>
     * {@link Link} と関連があるかも
     *
     */
    private void example() {
        System.out.println();
    }
}
