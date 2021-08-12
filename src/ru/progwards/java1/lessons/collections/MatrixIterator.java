package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int cur;
    int pos;
    int i;
    int x;
    int y;

    MatrixIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array != null && x < array.length && y < array[i].length)
            return true;
        return false;
    }

    @Override
    public T next() {
        x = 0;
        y = 0;
        pos = cur;
        for (i = 0; i < array.length; i++) {
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
        System.out.println(array4.length);
        System.out.println(array4[2].length);
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

