package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger{
    Short shi;
    String shi1;

    ShortInteger(short shi){
        this.shi = shi;
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public String toString(){
        shi1 = Short.toString(shi);
        return shi1;
    }

    public static void main(String[] args) {
        ShortInteger shortInteger = new ShortInteger((short) 12);
        System.out.println(shortInteger.toString());
        System.out.println(shortInteger);
    }
}
