package ru.progwards.java1.lessons.basic;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int x1 = number % 10;
        int x2 = number / 10;
        int x3 = x2 % 10;
        int x4 = x2 / 10;
        return x1 * 100 + x3 * 10 + x4;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(456));
        System.out.println(reverseDigits(789));
    }
}

