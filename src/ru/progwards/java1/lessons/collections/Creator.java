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

    public static void main(String[] args) {
        for (Integer i : fillEven(5)) {
            System.out.println(i);
        }
    }
}
