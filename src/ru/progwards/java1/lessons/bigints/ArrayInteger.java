package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;
    int n;
    BigInteger bigInteger;
    BigInteger bigInteger1;
    BigInteger bigInteger2;
    BigInteger bigIntegerresalt;

    ArrayInteger(int n) {
        this.n = n;
        digits = new byte[n];
    }

    void fromInt(BigInteger value) {
        for (int i = 0; i <= n-1; i++){
            bigInteger = value.remainder(BigInteger.TEN);
            byte num = bigInteger.byteValue();
            digits[i] = num;
            BigInteger bigInteger1 = value.divide(BigInteger.TEN);
            value = bigInteger1.abs();
        }
        System.out.println(Arrays.toString(digits));
    }


        BigInteger toInt(){
        for (int i = n - 1; i >= 0; i--) {
            int num1 = digits[i];
            bigInteger1 = new BigInteger(Integer.toString(num1));
            bigInteger2 = bigInteger1.multiply(BigInteger.TEN);

////            for (int j = i + 1; j <= n - 2; j++){
////                int num2 = digits[j];
////                bigInteger2 = new BigInteger(Integer.toString(num2));
//            }
          }
        return bigInteger2;

    }
//    boolean add(ArrayInteger num){
//
//    }
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("25157631");
        System.out.println(num1);
        num1.toByteArray();
        System.out.println(num1);
        ArrayInteger mas1 = new ArrayInteger(8);
        mas1.fromInt(num1);
        System.out.println(mas1.toInt());
    }
}
