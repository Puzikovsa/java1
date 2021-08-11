package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int element;

    MatrixIterator(T[][] array) {
        this.array = array;
        element = 0;
    }

    @Override
    public boolean hasNext() {
        if(array != null && element< array.length && element < array[0].length)
            return true;
        return false;
    }

    @Override
    public T next() {
        return array[element++][element++];
    }
}
