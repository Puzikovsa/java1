package ru.progwards.java1.lessons.compar_if_cycles;

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
        int a3 = 0;
        for (int i =3; i <= n; i++){
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
            return a3;
    }
//    public static boolean isGoldenTriangle(int a, int b, int c){
//
//    }

        public static void main (String[]args){
            System.out.println(containsDigit(967, 8));
            System.out.println(fiboNumber(15));
        }

    }