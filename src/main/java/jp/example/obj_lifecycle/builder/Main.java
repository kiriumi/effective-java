package jp.example.obj_lifecycle.builder;

public class Main {

    public static void main(String[] args) {

        final Person person = new Person.Builder("名前", "hoge@example.com")
                .telNo("0120123456").postalCode("0000000").region("都道府県").locality("市町村").build();

        System.out.println(person);
    }

}
