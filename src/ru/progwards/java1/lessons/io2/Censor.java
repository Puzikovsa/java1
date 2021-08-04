package ru.progwards.java1.lessons.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Censor {

    public static void censorFile(String inoutFileName, String[] obscene) throws FileNotFoundException {
        FileReader reader = new FileReader(inoutFileName);
        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()) {
            StringBuilder str = new StringBuilder(scan.nextLine());
            System.out.println(str);
            for (int i = 0; i < str.length(); i++) {
                for (String s : obscene) {
                    int charOn = str.indexOf(s);
                    if (charOn != -1) {
                        String str1 = s;
                        for (int a = 0; a < str1.length(); a++) {
                            str1 = str1.replace(str1.charAt(a), '*');
                        }
                        str.replace(charOn, (charOn + s.length()), str1);
                    }
                }
                }
            System.out.println(str);
            try {
                FileWriter writer = new FileWriter("src/ru/progwards/java1/lessons/io2/testText.txt");
                writer.write(str.toString());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }

    public static void main(String[] args) throws FileNotFoundException {
        censorFile("src/ru/progwards/java1/lessons/io2/testText.txt", new String[]{"Java", "Oracle", "Sun", "Microsystems"});
    }
}
