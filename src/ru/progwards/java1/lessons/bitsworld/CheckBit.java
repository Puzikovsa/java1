package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
      int result;
        for (int i = 0; i < bitNumber; i++) {
            value >>= 1;
        }
        return result = value & 1;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte) 2, 1));
    }
}
