package jp.example.concurrent.concurrent_util.collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Example {

    private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        System.out.println(intern("ほげ"));
        System.out.println(intern("ほげ"));
    }

    public static String intern(String str) {

        String result = map.get(str);
        if (result == null) {
            result = map.putIfAbsent(str, str);
            if (result == null) {
                result = str;
            }
        }
        return result;

    }

}
