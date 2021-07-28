package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) throws IOException {

        StringBuilder result = new StringBuilder();
        FileReader reader = new FileReader(inFileName);
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter(outFileName);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            for (int i = 0; i <= str.length() - 1; i++) {
                if (filter.indexOf(str.charAt(i)) == -1) {
                    result.append(str.charAt(i));
                }
            }
        }
        writer.write(result.toString());
        writer.close();
    }


    public static void main(String[] args) throws IOException {
        String obcsene = "ЭЖ ./,";
        filterFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "text2.txt", obcsene);
        System.out.println("Программа завершила работу");
    }
}

