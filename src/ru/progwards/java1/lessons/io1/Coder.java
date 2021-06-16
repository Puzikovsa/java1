package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader reader = new FileReader(inFileName);

            try (FileWriter writer = new FileWriter(outFileName)) {
                for (int ch; (ch = reader.read()) >= 0; ) {
                    for (int i = 0; i < code.length; i++){
                        if (code[i] == (char) ch){
                            Object symbol = null;
                            ch = code[(int)symbol];
                        }
                    }
                    writer.write(ch);
                }
            }
            catch (NullPointerException e){
                e.getMessage();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        codeFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "test.txt");
//    }
//

}
