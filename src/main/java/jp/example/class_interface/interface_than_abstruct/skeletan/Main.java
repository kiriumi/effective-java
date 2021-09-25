package jp.example.class_interface.interface_than_abstruct.skeletan;

public class Main {

    public static void main(String[] args) {

        final Concrete concrete = new Concrete();
        concrete.main();

        concrete.setField("フィールド値");
        System.out.println(concrete.toString());
    }

}
