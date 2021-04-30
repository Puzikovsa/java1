package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private byte num;
    String binaryNum = "";

    public Binary(byte num){
        this.num = num;
    }
    public String toString(){
        if(num < 0){
            binaryNum = 1 + binaryNum;
        }
        if(num >= 0){
            binaryNum = 0 + binaryNum;
        }
        for (int i = 0; i <= num; i++){
            int reminder = num & 1;
            binaryNum = binaryNum + reminder;
            num>>>=1;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        Binary after = new Binary((byte) 6);
        System.out.println(after.toString());
    }
}
