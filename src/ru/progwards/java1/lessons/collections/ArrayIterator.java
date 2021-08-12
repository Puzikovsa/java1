package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final T[] array;
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
        String[] array3 = {"Маша", "Дима", "Даша", "Настя"};
        ArrayIterator test = new ArrayIterator(array3);
        System.out.println(array3.length);
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
    }
}

