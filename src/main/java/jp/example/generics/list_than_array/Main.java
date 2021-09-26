package jp.example.generics.list_than_array;

public class Main {

    public static void main(String[] args) {

        // 実行時に失敗する（コンパイルエラーにならない）
        final Object[] objArray = new Integer[1];
        objArray[0] = "hoge"; // ArrayStoreExceptionが発生する

        // コンパイルエラーになる
        // final List<Object> objList = new ArrayList<Integer>();
        // objList.add("hoge");

        // 正常終了する
        // SubClass[]はSuperClass[]のサブタイプという事を意味する
        final SuperClass[] array = new SuperClass[1];
        array[0] = new SubClass();

        // コンパイルエラーになる
        // ※List<SuperClass>とList<SubClass>は、スーパータイプとサブタイプの関係ではない
        // final List<SuperClass> list = new ArrayList<SubClass>(); // コンパイルエラーになる
        //list.add("hoge");

    }

    // ジェネリック配列（総称配列）
    static <E> void genericArray() {
        // List<String>[] genList = new ArrayList<String>[3]; // コンパイルエラー
        // List<E>[] genList = new ArrayList<E>[3]; // コンパイルエラー
        // E[] genArray = new E[3]; // コンパイルエラー
    }

}
