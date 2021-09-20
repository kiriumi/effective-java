package jp.example.common_obj_method.hashcode.ng;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        final Map<Ng, String> map = new HashMap<>();
        map.put(new Ng("ほげ", 20), "NG");

        System.out.println(map.get(new Ng("ほげ", 20))); // null
    }

}
