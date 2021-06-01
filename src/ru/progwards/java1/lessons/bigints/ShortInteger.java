package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger{
    Short shortInt;
    String shortString1;

    ShortInteger(short shortInt){
        this.shortInt = shortInt;
    }

    @Override
    public int getNumber() {
        return shortInt;
    }

    @Override
    public String toString(){
        shortString1 = Short.toString(shortInt);
        return shortString1;
    }

    public static void main(String[] args) {
        ShortInteger shortInteger = new ShortInteger((short) 12);
        System.out.println(shortInteger.toString());
        System.out.println(shortInteger);
    }
}
