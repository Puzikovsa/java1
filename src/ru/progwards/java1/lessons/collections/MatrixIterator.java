package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int element;
    int i;
    int j;

    MatrixIterator(T[][] array) {
        this.array = array;
        element = 0;
    }

    @Override
    public boolean hasNext() {
        if(array != null && element< array.length && element < array[i].length)
            return true;
        return false;
    }

    @Override
    public T next() {
        return array[i++][j++];
    }
}
