package ru.progwards.java1.lessons.io1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) throws IOException {
        Arrays.sort(code);
        try {
            FileReader reader = new FileReader(inFileName);
            FileWriter writer = new FileWriter(outFileName);
            try {
                for (int ch; (ch = reader.read()) >= 0; ) {
                    ch = Arrays.binarySearch(code, (char) ch);
                    writer.write(ch);
                }

            } finally {
                writer.close();
            }
        } catch (FileNotFoundException e) {
            FileWriter except = new FileWriter(logName);
            except.write(e.getMessage());
            except.close();
        }
    }


//    public static void main(String[] args) {
//        codeFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "test.txt");
//    }
//

        }
