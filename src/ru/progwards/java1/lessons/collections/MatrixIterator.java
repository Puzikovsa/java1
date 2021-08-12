package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int i;
    int j;
    int cur;
    int pos;

    MatrixIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array != null && cur < array.length && pos < array[i].length)
            return true;
        return false;
    }

    @Override
    public T next() {
        int x = 0;
        int y = 0;
        pos = cur;
        for (int i = 0; i < array.length; i++) {
            if (pos >= array[i].length)
                pos = pos - array[i].length;
            else {
                x = i;
                y = pos % array[i].length;
                break;
                }
            }
        cur++;
        return array[x][y];
    }

    public static void main(String[] args) {
        String[] array1 = {"Алексей", "Юрий", "Федор"};
        String[] array2 = {"Юля", "Саша"};
        String[] array3 = {"Маша", "Дима", "Даша", "Настя"};
        String[][] array4 = {(array1), (array2), (array3)};
        MatrixIterator it = new MatrixIterator(array4);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}

