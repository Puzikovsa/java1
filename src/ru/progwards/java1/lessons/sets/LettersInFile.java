package ru.progwards.java1.lessons.sets;

import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class LettersInFile {

    private static TreeSet<String> chars = new TreeSet<>();

    public LettersInFile() {
    }

    public static String process(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        for (int ch; (ch = reader.read()) >= 0;) {
            if (Character.isLetter(ch))
            chars.add(Character.toString(ch));
        }

        StringBuilder letersResult = new StringBuilder();
        for (String s: chars){
            letersResult.append(s);
        }
        String result = letersResult.toString();
        return result;
    }

    public static void main(String[] args) throws IOException {
        LettersInFile leter = new LettersInFile();
        System.out.println(leter.process("C:\\Users\\puzik\\IdeaProjects\\hello world\\log.txt"));
    }
}
