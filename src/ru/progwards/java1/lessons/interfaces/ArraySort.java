package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class ArraySort {
//    public ArraySort;

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int per = a[i];
                int per1 = a[j];
                if (per < per1) {
                    a[i] = per1;
                    a[j] = per;
                }
            }
        }
    }

    public static void sort(CompareWeight[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                CompareWeight per = a[i];
                CompareWeight per1 = a[j];
                if (per.compareWeight(per1) == CompareWeight.CompareResult.LESS) {
                    a[i] = per1;
                    a[j] = per;
                }
            }
        }
    }

    public static void main(String[] args) {
        Animal bird = new Animal(12.0);
        Hamster ivanich = new Hamster(0.4);
        Duck skruge = new Duck(1.2);
        Cow burenka = new Cow(150.2);
        CompareWeight[] animals = {bird, ivanich, skruge, burenka};
        System.out.println(animals.toString());
        System.out.println(Arrays.stream(animals).sorted());
        sort(animals);
        System.out.println(Arrays.toString(animals));
    }
}
