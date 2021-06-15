package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

    public static int calcEmpty(String fileName) throws IOException {
        int count = 0;
        try {
            FileReader readFile = new FileReader(fileName);
            try (readFile; Scanner scan = new Scanner(readFile)) {
                while (scan.hasNextLine()) {
                    String str = scan.nextLine();
                    if (str.equals("")) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            throw new IOException("-1");
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(calcEmpty("src/ru/progwards/java1/lessons/io1/text.txt"));
    }
}

