package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
      int result;
        for (int i = 7; i > bitNumber; i--) {
            value >>= 1;
        }
        result = value & 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte) 0b11000101, 4));
    }
}
