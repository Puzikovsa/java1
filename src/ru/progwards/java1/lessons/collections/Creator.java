package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Creator {

    public static Collection<Integer> fillEven(int n) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
                arrayList1.add(2 * (i + 1));
        }
        return arrayList1;
    }

    public static Collection<Integer> fillOdd(int n){
        ArrayList<Integer> arrayList2 = new ArrayList<>(n);
        for (int i = n - 1; i >= 0; i--){
            arrayList2.add(i*2 + 1);
        }
        return arrayList2;
    }

    public static ArrayList<Integer> fill3(int n){
        ArrayList<Integer> arrayList3 = new ArrayList<>(n*3);
        for (int i = 0; i < n*3; i  +=3){
            arrayList3.add(i);
            arrayList3.add(i*i);
            arrayList3.add(i*i*i);
        }
        return arrayList3;
    }

    public static void main(String[] args) {
        for (Integer i : fill3(3)) {
            System.out.println(i);
        }
    }
}
