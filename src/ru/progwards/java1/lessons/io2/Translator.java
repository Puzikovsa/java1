package ru.progwards.java1.lessons.io2;

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
        String str2 = "";
        for (String item : items) {
            for (int j = 0; j < inLang.length; j++) {
                if (inLang[j].equalsIgnoreCase(item)) {
                    words.append(outLang[j]).append(" ");
                    break;
//                } else {
//                    words.append(items[i]).append(" ");
//                    break;
                }
            }
        }
        return words.toString();
    }

    public static void main(String[] args) {
        Translator big = new Translator(new String[]{"world", "hello", "important", "easy"}, new String[]{"мир", "привет", "важно", "легко"});
        System.out.println(big.translate("World! Molly, Hello!, world"));
    }
}
