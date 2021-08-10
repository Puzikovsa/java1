package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final T[] array;

    ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public T next() {
        Object T = null;
        for (T t : array) {
            T = t;
        }
        return (T) T;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i + 1);
        }
        Object[] array1 = arrayList.toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(array1[5]);
        System.out.println(new ArrayList<>(Collections.singleton(new ArrayIterator[5])));

    }
}

