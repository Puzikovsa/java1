package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private byte num;
    String binaryNum = "";

    public Binary(byte num){
        this.num = num;
    }
    public String toString(){
        for (int i = 0; i <8; i++){
            int reminder = num & 1;
            binaryNum = binaryNum + reminder;
            num>>>=1;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        Binary after = new Binary((byte) -5);
        System.out.println(after.toString());
    }
}
