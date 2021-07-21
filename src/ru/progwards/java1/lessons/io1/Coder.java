package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Coder {

    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            // читаем файл inFilename
            FileReader reader = new FileReader(inFileName);

            try (
                    // создаем новый FileWriter
                    // reader;
                FileWriter writeResult = new FileWriter(outFileName)) {
                try {
                    for (int ch; (ch = reader.read())>= 0;){
                        writeResult.write(ch);
                    }
                }
                finally {
                    reader.close();
                    writeResult.close();
                }

            }
                // при ошибке записываем сообщение об ошибке в logName с помощью метода writeToLog
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            writeToLog(logName, e.getMessage());
        }

        }


    public static void writeToLog(String logName, String message) {


        try {
            try (FileWriter log = new FileWriter(logName, true)) {
                log.write(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public static void main (String[]args){
            String nstring = "Все это достаточно тяжело запомнить, потому что трудно себе это представить";
            char[] code = nstring.toCharArray();
            codeFile("C:\\Users\\puzik\\IdeaProjects\\Testing_lesson_10\\File.txt", "text.txt", code, "log.txt");
            System.out.println("Программа закончила работу.");

        }
    }


