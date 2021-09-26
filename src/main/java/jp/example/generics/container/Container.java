package jp.example.generics.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 異種コンテナ：クラスをキー、インスタンスを値とするマップ
public class Container {

    Map<Class<?>, Object> countainer = new HashMap<>();

    public <T> void put(Class<T> type, T instance) {

        // instance.getClass()だとProxyクラス（jdk.proxy2.$Proxy1）のため、キーとして不適切になってしまう
        countainer.put(Objects.requireNonNull(type), type.cast(instance));
    }

    public <T> T get(Class<T> type) {

        // type.castメソッドだと「@SuppressWarnings("unchecked")」を付けなくてよい
        // ※(T) だと必要
        return type.cast(countainer.get(type));

    }

}
