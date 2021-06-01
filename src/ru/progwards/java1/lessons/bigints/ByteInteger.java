package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger{
    byte b;
    String b1;
    ByteInteger(byte b) {
        this.b = b;
    }

    @Override
    public int getNumber() {
        return b;
    }
    @Override
    public String toString(){
        b1 = Byte.toString(b);
        return b1;
    }

    public static void main(String[] args) {
        ByteInteger byte1 = new ByteInteger((byte) 12);
        System.out.println(byte1.toString());
    }
}
