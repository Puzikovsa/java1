package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    private int N;

    public Eratosthenes(int N){
        sieve = new boolean[N];
        this.N = N;
        Arrays.fill(sieve, true);
        sift();
    }
    private void sift() {
        sieve[0] = false;
        sieve[1] = false;
                for (int i = 2; i < N - 1; i++) {
                for (int j = i + i; j < N - 1; j+=i) {
                    sieve[j] = false;
                }
        }
    }
    public boolean isSimple(int n){
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(20);
        System.out.println(era.isSimple(19));
    }
}