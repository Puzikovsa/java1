package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int i;
    int j;

    MatrixIterator(T[][] array) {
        this.array = array;
        i = 0;
        j = 0;
    }

    @Override
    public boolean hasNext() {
        if(array != null && i < array.length && j < array[i].length)
            return true;
        return false;
    }

    @Override
    public T next() {
        while (j < array[i].length){
            T result = array[i][j++];
            i++;
        }
        return array[i][j];
    }
}
