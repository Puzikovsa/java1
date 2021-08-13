package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int cur = 0;
    int arr_size = 1;


    MatrixIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return cur < arr_size;
    }

    @Override
    public T next() {
        int x = 0;
        int y = 0;
        int arr_size1 = 0;
        int pos = cur;
        for (int i = 0; i < array.length; i++) {
            arr_size = array[i].length;
            if (pos >= array[i].length) {
                pos = pos - array[i].length;
                arr_size1 = array[i + 1].length;
            } else {
                x = i;
                y = pos % array[i].length;
                break;
            }
            
        }
        arr_size = arr_size + arr_size1;
        cur++;
        arr_size++;
        return array[x][y];
    }

    public static void main(String[] args) {
        String[] array1 = {"Алексей", "Юрий", "Федор"};
        String[] array2 = {"Юля", "Саша"};
        String[] array3 = {"Маша", "Дима", "Даша", "Настя"};
        String[][] array4 = {(array1), (array2), (array3)};
        MatrixIterator it = new MatrixIterator(array4);
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
    }
}

