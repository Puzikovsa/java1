package ru.progwards.java1.lessons.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Censor {

    public static void censorFile(String inoutFileName, String[] obscene) throws CensorExeption {
        try {
            FileReader reader = new FileReader(inoutFileName);
            Scanner scan = new Scanner(reader);
            StringBuilder strRead = new StringBuilder();
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                strRead.append(str);
                for (int i = 0; i < strRead.length(); i++) {
                    for (String s : obscene) {
                        int charOn = strRead.indexOf(s);
                        if (charOn != -1) {
                            String str1 = s;
                            for (int a = 0; a < str1.length(); a++) {
                                str1 = str1.replace(str1.charAt(a), '*');
                            }
                            strRead.delete(charOn, (charOn + str1.length()));
                            strRead.insert(charOn, str1);
                        }

                    }
                }
                FileWriter writer = new FileWriter(inoutFileName);
                writer.write(strRead.toString());
                writer.close();
                reader.close();
            }
        } catch (Exception e) {
            throw new CensorExeption(inoutFileName, e.getMessage());
        }
    }

    public static class CensorExeption extends Exception {
        String fileName;
        String message;

        CensorExeption(String fileName, String message) {
            this.fileName = fileName;
            this.message = message;
        }


        @Override
        public String toString() {
            return fileName + ":" + message;
        }

    }

    public static void main(String[] args) {
        try {
            censorFile("src/ru/progwards/java1/lessons/io2/testText.txt", new String[]{"Java", "Oracle", "Sun", "Microsystems"});
        } catch (CensorExeption e) {
            System.out.println(e.toString());
        }
    }
}
