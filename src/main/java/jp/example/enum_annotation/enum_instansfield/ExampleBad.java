package jp.example.enum_annotation.enum_instansfield;

enum ExampleBad {

    SOLO, DUET, TRIO;

    public int number() {
        // ordinal() は enum定数が何番目に定義されているかを返す
        // ∴保守がしずらい
        return ordinal() + 1;
    }
}
