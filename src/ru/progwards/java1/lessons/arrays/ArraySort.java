package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a){
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                int per = a[i];
                int per1 = a[j];
                if (per > per1){
                    a[i] = per1;
                    a[j] = per;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {-4,14,26,-1,0};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
