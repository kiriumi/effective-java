package jp.example.class_interface.access.pack.subpack;

import jp.example.class_interface.access.pack.PublicClass;

public class Main {

    public static void main(String[] args) {

        // 親パッケージのパッケージ・プライベートクラスはアクセスできない

        final PublicClass publicClass = new PublicClass();

        final String publicField = publicClass.publicField;
        publicClass.publicMethod();

    }

}
