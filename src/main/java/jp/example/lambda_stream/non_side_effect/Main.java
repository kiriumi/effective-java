package jp.example.lambda_stream.non_side_effect;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // NG
        final List<Integer> fromList = List.of(1, 2, 3, 4, 5);

        final List<Integer> ngList = new ArrayList<>();
        fromList.forEach(ngList::add); // ストリームパイプラインの外側の変数を変更している
        ngList.forEach(System.out::println);

        System.out.println("----------------");

        // OK
        final List<Integer> okList = fromList.stream().filter(x -> (x % 2 == 0)).collect(toList()); // CollectorsクラスのメソッドでListなどに変換し返す
        okList.forEach(System.out::println);
    }

}
