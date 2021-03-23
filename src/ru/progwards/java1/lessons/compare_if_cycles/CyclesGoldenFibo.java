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
        double a1 = (int)a;
        double b1 = (int)b;
        double c1 = (int)c;
        if ((a1==b1&&a1/c1>=1.61703&&a/c1<=1.61903)||(b1==c1&&b1/a1>=1.61703&&b1/a1<=1.61903)||(a1==c1&&a1/b1>=1.61703&&a1/b1<=1.61903)){
            return true;
        }
        else return false;
   }

        public static void main (String[]args){
            System.out.println(containsDigit(967, 6));
            for (int i = 1; i <=15; i++) {
                System.out.println(fiboNumber(i));
            }
            for (int i = 1; i <=15; i++) {
                int a = fiboNumber(i+1);
                int b = fiboNumber(i+1);
                int c = fiboNumber(i);
            if(isGoldenTriangle(a,b,c) == true && fiboNumber(i +1) <=100){
                System.out.println("Золотой треугольник с ребром " + a + " и основанием " + c + ".");
                }
            }

    }

}