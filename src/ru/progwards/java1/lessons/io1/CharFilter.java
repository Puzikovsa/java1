package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) {
        try {
            FileReader reader = new FileReader(inFileName);
            try (FileWriter writer = new FileWriter(outFileName)) {
                for (int ch; (ch = reader.read()) >= 0; ) {
                    int a = Integer.parseInt(filter);
                    if (ch != a) {
                        writer.write(ch);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        filterFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "text2.txt","C:\\Users\\puzik\\IdeaProjects\\hello world\\obcsene.txt");
        System.out.println("Программа закончила работу");
    }
}
