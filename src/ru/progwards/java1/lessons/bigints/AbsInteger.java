package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
    public static AbsInteger absInteger;

    public abstract int getNumber();

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int result = num1.getNumber() + num2.getNumber();
        ByteInteger resultBite;
        ShortInteger resultShot;
        IntInteger resultInt;
        if (result >= -127 & result <= 128) {
            return resultBite = new ByteInteger((byte) result);
        } else if (result >= -32768 & result <= 32767) {
            return resultShot = new ShortInteger((short) result);
        } else return resultInt = new IntInteger(result);

    }

    public static void main(String[] args) {
        ByteInteger num1 = new ByteInteger((byte) 25);
        IntInteger num2 = new IntInteger(2567);
        System.out.println(add(num1,num2));
    }
}

