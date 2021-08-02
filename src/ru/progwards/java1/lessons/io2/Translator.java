package ru.progwards.java1.lessons.io2;

import java.util.Locale;

public class Translator {
    private final String[] inLang;
    private final String[] outLang;

    public Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }

    public String translate(String sentence) {

        String str = sentence.toLowerCase(Locale.ROOT);
        StringBuilder stringTranslate = new StringBuilder(str);
        for (int i = 0; i < inLang.length; i++) {
            int on = stringTranslate.indexOf(inLang[i]);
            if (on != -1) {
                stringTranslate.delete(on, on + inLang[i].length());
                stringTranslate.insert(on, outLang[i]);
            }
        }
            return stringTranslate.toString();
        }

    public static void main(String[] args) {
        Translator big = new Translator(new String[]{"world", "hello", "important", "easy"}, new String[]{"мир", "привет", "важно", "легко"});
        System.out.println(big.translate("Hello! Molly, World!"));
    }
}
