package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Coder {

    public static void codeFile(String inFileName, String outFileName, char[] code/*, String logName*/) {
        try {
            String strFinal = "";
            FileReader reader = new FileReader(inFileName);

            try (reader;
                 Scanner scanner = new Scanner(reader);
                 FileWriter writeResult = new FileWriter(outFileName)) {
                while (scanner.hasNextLine()) {

                    strFinal = scanner.nextLine();
                }

                char[] result = strFinal.toCharArray();
                System.arraycopy(code, 0, result, 0, result.length - 1 + 1);
                writeResult.write(result);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        String nstring = "Все это достаточно тяжело запомнить, потому что трудно себе это представить";
        char[] code = nstring.toCharArray();
        codeFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "text.txt", code);

    }
}
