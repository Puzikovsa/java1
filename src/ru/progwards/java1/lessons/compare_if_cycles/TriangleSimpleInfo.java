package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
       int d = Math.max(a, b);
        return Math.max(d, c);
    }
    public static int minSide(int a, int b, int c){
        int d = Math.min(a, b);
        return Math.min(d, c);
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        if ( a == b && b == c ){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(maxSide(2, 2, 3));
        System.out.println(minSide(2,2,3));
        System.out.println(isEquilateralTriangle(2,3,2));
    }
}
