package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public static void main(String[] args) {
        for (Integer i : fillOdd(5)) {
            System.out.println(i);
        }
    }
}
