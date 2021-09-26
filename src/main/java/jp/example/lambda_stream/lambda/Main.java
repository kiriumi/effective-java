package jp.example.lambda_stream.lambda;

import lombok.Getter;

public class Main {

    public static void main(String[] args) {

        final Interface lambda = () -> System.out.println("ラムダ式");
        lambda.execute();

        final SuperClass superClass = new SuperClass("無名クラス") {

            @Getter
            private String customField;

            @Override
            void hello() {
                this.customField = "やあ、";
                System.out.println(customField + "こんちは");
            }

            @Override
            void goodNight() {
                System.out.println(customField + "おやすみ");
            }

        };
        superClass.hello();
        superClass.goodNight();

    }

}
