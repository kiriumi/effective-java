package jp.example.enum_annotation.enum_instansfield;

public enum ExampleGood {

    SOLO(1), DUET(2), TRIO(3);

    private int number;

    ExampleGood(int number) {
        this.number = number;
    }

    int number() {
        return number;
    }
}
