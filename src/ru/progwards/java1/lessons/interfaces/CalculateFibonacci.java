package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    private static CacheInfo LastFibo;


    public static int fiboNumber(int n) {
        if (getLastFibo() == null) {
            LastFibo = new CacheInfo();
        }
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
            LastFibo.n = n;
            return LastFibo.fibo;
        }
    }

    public static class CacheInfo {
        public int n;
        public int fibo;

    }

    public static CacheInfo getLastFibo() {
        return LastFibo;
    }

    public static void clearLastFibo() {
        CalculateFibonacci.LastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println(LastFibo);
        System.out.println(fiboNumber(13));
        System.out.println(fiboNumber(15));
        System.out.println(fiboNumber(1));
        System.out.println(getLastFibo());
        System.out.println(LastFibo.fibo);

    }
}

