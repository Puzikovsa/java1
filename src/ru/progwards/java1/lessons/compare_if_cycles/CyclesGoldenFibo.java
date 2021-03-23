package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {

        if (number == digit || number % 10 == digit) {
            return true;
        }
        while (number >= 10) {
            number = number / 10;
            if (number % 10 == digit) {
                return true;
            }
        }
        return false;
    }

    public static int fiboNumber(int n){
        int a1 = 1;
        int a2 = 1;
        int a3 = 1;
        for (int i =3; i <= n; i++){
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
            return a3;
    }
   public static boolean isGoldenTriangle(int a, int b, int c){
        if ((a==b&&a/c>=1.61703&&a/c<=1.61903)||(b==c&&b/a>=1.61703&&b/a<=1.61903)||(a==c&&a/b>=1.61703&&a/b<=1.61903)){
            return true;
        }
        else return false;
   }

        public static void main (String[]args){
            System.out.println(containsDigit(967, 8));
            System.out.println(fiboNumber(1));
            System.out.println(fiboNumber(2));
            System.out.println(fiboNumber(3));
            System.out.println(fiboNumber(4));
            System.out.println(fiboNumber(5));
            System.out.println(fiboNumber(6));
            System.out.println(fiboNumber(7));
            System.out.println(fiboNumber(8));
            System.out.println(fiboNumber(9));
            System.out.println(fiboNumber(10));
            System.out.println(fiboNumber(11));
            System.out.println(fiboNumber(12));
            System.out.println(fiboNumber(13));
            System.out.println(fiboNumber(14));
            System.out.println(fiboNumber(15));
            System.out.println(isGoldenTriangle(89,89,55));
        }

    }