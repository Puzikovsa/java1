package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    private static CacheInfo LastFibo;

    public static int fiboNumber(int n) {
        if (n == LastFibo.n) return LastFibo.fibo;
        else {
            int a1 = 1;
            int a2 = 1;
            int a3 = 1;
            for (int i = 3; i <= n; i++) {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            LastFibo.fibo = a3;
            return a3;
        }
    }

            public static class CacheInfo {
                public int n;
                public int fibo;
            }

        public static CacheInfo getLastFibo(){
            return LastFibo;
        }
        public static void clearLastFibo(){
            CalculateFibonacci.LastFibo = null;
        }

    public static void main(String[] args) {
        LastFibo = new CacheInfo();
        System.out.println(LastFibo);
        System.out.println(fiboNumber(5));
        System.out.println(fiboNumber(12));
        System.out.println(fiboNumber(7));
        System.out.println(getLastFibo());
        clearLastFibo();
        System.out.println(getLastFibo());
        LastFibo = new CacheInfo();
        System.out.println(fiboNumber(15));
    }
}

