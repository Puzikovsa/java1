package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int result = 0;
        while (value > 0){
            int remeinder = value & 1;
            result = result + remeinder;
            value >>=1;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 0b00110011));
    }

}
