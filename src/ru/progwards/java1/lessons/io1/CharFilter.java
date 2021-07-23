package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter) throws IOException {

        String result = "";
        FileReader reader = new FileReader(inFileName);
        Scanner scanner = new Scanner(reader);
        FileWriter writer = new FileWriter(outFileName);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            for (int i = 0; i <= str.length() - 1; i++) {
                if (filter.indexOf(str.charAt(i)) == -1) {
                    result = result + str.charAt(i);
                }
            }
                writer.write(result);
            }
            writer.close();
        }


    public static void main(String[] args) throws IOException {
        String obcsene = " ./,";
        filterFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "text2.txt", obcsene);
        System.out.println("Программа завершила работу");
    }
}

