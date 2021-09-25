package jp.example.generics.generics;

import java.util.List;
import java.util.Map;

import jp.example.class_interface.composition.SuperClass;

class Example {

    // 仮型パラメータ ----------------
    // ・宣言が必要
    // ・クラスにも使える
    // ・ダイヤモンド（List<T> ）だけでなく、通常の型や配列として使える
    // ・下限境界は使用できない
    // ・変数格納時に受け取れない

    // 非境界
    <T> T dummyParam(T value) {
        return value;
    }

    // 使い方、意味合いは→と同じ「List<?> wildcard(List<?> value)」
    <T> List<T> genericsList(List<T> value) {
        return value;
    }

    // 配列
    <T> T[] genericsArray(@SuppressWarnings("unchecked") T... value) {
        return value;
    }

    // 上限境界
    <T extends SupperClass> T dummyParamExtends(T value) {
        return value;
    }

    <T extends Interface> T dummyParamExtendsIf(T value) {
        return value;
    }

    <T extends SupperClass> List<T> genericsListExtends(List<T> value) {
        return value;
    }

    <T extends SupperClass> T[] genericsArrayExtends(@SuppressWarnings("unchecked") T... value) {
        return value;
    }

    <T, U extends Number> T dummyParamExtends(T value, U number) {
        return value;
    }

    // ワイルドカード型 ----------------
    // ・宣言が不要
    // ・クラスは使えない
    // ・ダイヤモンド（List<?>など）にしか使えない（通常の型や配列として使えない）
    // ・変数格納時に受け取れる

    // 非境界
    List<?> wildcard(List<?> value) {
        return value;
    }

    // 上限境界
    List<? extends SuperClass> wildcardExtends(List<? extends SuperClass> value) {
        return value;
    }

    List<? extends Interface> wildcardExtendsIf(List<? extends Interface> value) {
        return value;
    }

    Map<?, ? extends Number> wildcardMap(Map<?, ? extends Number> value) {
        return value;
    }

    // 下限境界（使うことはほとんどないと思われる）
    List<? super SubClass> wildcardSuper(List<? super SubClass> value) {
        return value;
    }

    List<? super Interface> wildcardSuperIf(List<? super Interface> value) {
        return value;
    }

    // ワイルドカード型での変数格納受け取り用
    List<Number> numberList() {
        return List.of(1, 2, 3);
    }

    List<?> wildcardList() {
        return List.of(1, 2, 3);
    }

}
