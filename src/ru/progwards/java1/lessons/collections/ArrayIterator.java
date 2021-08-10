package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;
    int anInt;

    ArrayIterator(T[] array) {
        this.array = array;
        anInt = 0;
    }

    @Override
    public boolean hasNext() {
        if(array != null && anInt < array.length)
            return true;
        return false;
    }

    @Override
    public T next() {
        return array[anInt++];
    }

    public static void main(String[] args) {
    }
}

