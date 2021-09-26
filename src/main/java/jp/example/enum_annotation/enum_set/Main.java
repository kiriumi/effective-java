package jp.example.enum_annotation.enum_set;

import java.util.EnumSet;

import jp.example.enum_annotation.enum_set.Example.Style;

public class Main {

    public static void main(String[] args) {

        // ビットフィールドを使用した場合
        final int styles = Example.STYLE_BOLD | Example.STYLE_ITALIC;
        System.out.println("太字＆イタリック：" + styles); // 001 + 010 -> 011 = 3

        // EnumSetを使った場合
        final EnumSet<Style> boldItalic = EnumSet.of(Style.BOLD, Style.ITALIC);
        boldItalic.forEach(System.out::println);

    }

}
