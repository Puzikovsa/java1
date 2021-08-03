package ru.progwards.java1.lessons.io2;

import java.util.Arrays;
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
            int charOn = stringTranslate.indexOf(inLang[i]);
            if (charOn != -1) {
                stringTranslate.delete(charOn, charOn + inLang[i].length());
                stringTranslate.insert(charOn, outLang[i]);
            }
        }
        String[] photo = sentence.split(" ");
        System.out.println(Arrays.toString(photo));
        String result = stringTranslate.toString();
        System.out.println(result);
        String[] photoTranslate = result.split(" ");
        System.out.println(Arrays.toString(photoTranslate));

        for (int j = 0; j < photo.length; j++) {
            boolean up = Character.isUpperCase(photo[j].charAt(0));
            if (up) {
                char c = Character.toUpperCase(photoTranslate[j].charAt(0));
                String str1 = photoTranslate[j].toString();
                System.out.println(str1);
            }

        }

        return Arrays.toString(photoTranslate);
    }

    public static void main(String[] args) {
        Translator big = new Translator(new String[]{"world", "hello", "important", "easy"}, new String[]{"мир", "привет", "важно", "легко"});
        System.out.println(big.translate("world, Molly!, Hello!"));
    }
}
