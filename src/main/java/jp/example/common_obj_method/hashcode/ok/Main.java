package jp.example.common_obj_method.hashcode.ok;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        final Map<Ok, String> map = new HashMap<>();
        map.put(new Ok("ほげ", 20), "OK");

        System.out.println(map.get(new Ok("ほげ", 20))); // 「OK」が表示される
    }

}
