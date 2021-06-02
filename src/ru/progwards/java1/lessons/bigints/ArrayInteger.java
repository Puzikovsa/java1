package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;
    int n;


    ArrayInteger(int n) {
        this.n = n;
        digits = new byte[n];
    }

    void fromInt(BigInteger value) {
        BigInteger bigInteger;
        for (int i = 0; i <= n - 1; i++) {
            bigInteger = value.remainder(BigInteger.TEN);
            byte num = bigInteger.byteValue();
            digits[i] = num;
            BigInteger bigInteger1 = value.divide(BigInteger.TEN);
            value = bigInteger1.abs();
        }
        System.out.println(Arrays.toString(digits));
    }


    BigInteger toInt() {
        BigInteger bigInteger1;
        BigInteger bigIntegerResalt = BigInteger.ZERO;
        for (int i = n - 1; i >= 0; i--) {
            int num1 = digits[i];
            int degry = (int) Math.pow(10, i);
            int numResult = num1 * degry;
            bigInteger1 = BigInteger.valueOf(numResult);
            bigIntegerResalt = bigIntegerResalt.add(bigInteger1);
        }
        return bigIntegerResalt;

    }

        boolean add(ArrayInteger num){
        return false;
    }
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("25157631");
        System.out.println(num1);
        num1.toByteArray();
        System.out.println(num1);
        ArrayInteger mas1 = new ArrayInteger(8);
        mas1.fromInt(num1);
        System.out.println(mas1.toInt());
        BigInteger num2 = new BigInteger("4567");
    }
}
