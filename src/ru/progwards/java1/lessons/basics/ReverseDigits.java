package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int units = number % 10;
        int dozens = number / 10;
        int ten = dozens % 10;
        int hundreds = number / 100;
        return units * 100 + ten * 10 + hundreds;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(456));
        System.out.println(reverseDigits(786));
    }
}


