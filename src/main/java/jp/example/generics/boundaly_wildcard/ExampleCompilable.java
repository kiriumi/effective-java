package jp.example.generics.boundaly_wildcard;

import java.util.List;
import java.util.Map;

import jp.example.class_interface.composition.SuperClass;

class ExampleCompilable {

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

    // 上限境界（スーパークラス）
    <T extends SuperClass> T dummyParamExtends(T value) {
        return value;
    }

    // 上限境界（インターフェース）
    <T extends Interface> T dummyParamExtendsIf(T value) {
        return value;
    }

    // 上限境界（上限を仮型パラメータで指定）
    // ※コンパイルエラーにはならないが、Uを指定できないので実用性はない
    <T extends U, U> T dummyParamExtendsDummy(T value) {
        return value;
    }

    // 複数の仮型パラメータを指定
    <T, U extends Number> Map<T, U> multiDuummyParams(T value, U number) {
        return Map.of(value, number);
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

    // 上限境界（スーパークラス）
    // ※戻り値に境界ワイルドカードはアンチパターンなので注意
    List<? extends SuperClass> wildcardExtends(List<? extends SuperClass> value) {
        return value;
    }

    // 上限境界（インターフェース）
    // ※戻り値に境界ワイルドカードはアンチパターンなので注意
    List<? extends Interface> wildcardExtendsIf(List<? extends Interface> value) {
        return value;
    }

    // 下限境界（サブクラス）
    // ※戻り値に境界ワイルドカードはアンチパターンなので注意
    List<? super SubClass> wildcardSuper(List<? super SubClass> value) {
        return value;
    }

    // 下限境界（インターフェース）
    // ※戻り値に境界ワイルドカードはアンチパターンなので注意
    List<? super Interface> wildcardSuperIf(List<? super Interface> value) {
        return value;
    }

    // 複数のワイルドカードを使用
    // ※戻り値に境界ワイルドカードはアンチパターンなので注意
    Map<?, ? extends Number> multiWildcards(Map<?, ? extends Number> value) {
        return value;
    }

}
