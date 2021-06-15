package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

    public static int calcEmpty(String fileName) throws IOException {
        int count = 0;
        try {
            FileReader readFile = new FileReader(fileName);
            Scanner scan = new Scanner(readFile);
            try {
                while (scan.hasNextLine()) {
                    String str = scan.nextLine();
                    if (str == "") {
                        count++;
                    }
                }
            } finally {
                scan.close();
                readFile.close();
            }
        } catch (IOException e) {
            e.getMessage();
            return -1;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(calcEmpty("src/ru/progwards/java1/lessons/io1/text.tx"));
    }
}

