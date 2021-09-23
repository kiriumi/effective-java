package jp.example.class_interface.access.pack;

import jp.example.class_interface.access.pack.PackageClass.PackageInnerClass;
import jp.example.class_interface.access.pack.PackageClass.PublicInnerClass;

public class Main {

    public static void main(String[] args) {

        // 子パッケージのExampleSubクラスにはアクセスできない

        final PackageClass packageClass = new PackageClass();

        final String publicField = packageClass.publicField;
        final String protectedField = packageClass.protectedField;
        final String packageField = packageClass.packageField; // 同一パッケージの場合、protectedもアクセス可能

        packageClass.publicMethod();
        packageClass.packageMethod();
        packageClass.protectedMethod(); // 同一パッケージの場合、protectedもアクセス可能

        // ----------------

        // 内部クラスのインスタンス生成
        final PublicInnerClass innerPublicClass = packageClass.new PublicInnerClass();

        final String innerPublicField = innerPublicClass.innerPublicField;
        final String innerPackageField = innerPublicClass.innerPackageField;
        final String innerProtectedField = innerPublicClass.innerProtectedField;

        innerPublicClass.innerPublicMethod();
        innerPublicClass.innerProtectedMethod();
        innerPublicClass.innerProtectedMethod();

        // ----------------

        // Publicと同一（使う意味はない）
        final PackageInnerClass packageInnerClass = packageClass.new PackageInnerClass();

        final String innerPublicFieldPackage = packageInnerClass.innerPublicField;
        final String innerPackageFieldPackage = packageInnerClass.innerPackageField;
        final String innerProtectedFieldPackage = packageInnerClass.innerProtectedField;

        packageInnerClass.innerPublicMethod();
        packageInnerClass.innerProtectedMethod();
        packageInnerClass.innerProtectedMethod();

    }

}
