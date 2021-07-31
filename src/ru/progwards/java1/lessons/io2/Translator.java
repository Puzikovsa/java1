package ru.progwards.java1.lessons.io2;

import java.util.Arrays;

public class Translator {
    private final String[] inLang;
    private final String[] outLang;

    public Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }

    public String translate(String sentence) {
        StringBuilder words = new StringBuilder();
//        разбиваем sentence на массив строк
        String[] items = sentence.split(" ");
//        убираем пунктуацию(оставляем в массиве только буквы
        for (int i = 0; i < items.length; i++) {
            StringBuilder str1 = new StringBuilder();
            for (char c : items[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    str1.append(c);
                }
            }
            items[i] = str1.toString();
        }
//        заменяем слова из sentence на слова из out
        for (String item : items) {
            for (int i = 0; i < inLang.length; i++) {
                if (item.equalsIgnoreCase(inLang[i])) {
                    words.append(outLang[i]);
                } else {
                    words.append(item);
                }
            }
            words.append(" ");
        }
        return words.toString();
    }

    public static void main(String[] args) {
        Translator big = new Translator(new String[]{"world", "hello"}, new String[]{"мир", "привет"});
        System.out.println(big.translate("World! Molly, Hello!"));
    }
}
