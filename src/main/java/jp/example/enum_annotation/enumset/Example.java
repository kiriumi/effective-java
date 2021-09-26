package jp.example.enum_annotation.enumset;

class Example {

    // ビットフィールド
    public static final int STYLE_BOLD = 1 << 0; // 1（001）
    public static final int STYLE_ITALIC = 1 << 1; // 2（010）
    public static final int STYLE_UNDERLINE = 1 << 2; // 4（100）

    // Enum
    enum Style {
        BOLD, ITALIC, UNDERLINE
    }
}
