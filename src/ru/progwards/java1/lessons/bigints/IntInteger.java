package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger{

    int anInt;
    String anInt1;
    IntInteger(int anInt){
        this.anInt = anInt;

    }

    @Override
    public int getNumber() {
        return anInt;
    }

    @Override
    public String toString(){
        anInt1 = Integer.toString(anInt);
        return anInt1;
    }

    public static void main(String[] args) {
        IntInteger int1 = new IntInteger(120);
        System.out.println(int1.toString());
    }
}
