package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    int cur = 0;
    int arr_size = 1;
    int arr_size1 = 0;
    int arr_size2 = 0;

    MatrixIterator(T[][] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                arr_size1 = array[i].length;
            }
            arr_size = arr_size + arr_size1;
            }
        }

    @Override
    public boolean hasNext() {
        return cur < arr_size - 1;
    }

    @Override
    public T next() {
        int x = 0;
        int y = 0;
        int pos = cur;
        for (int i = 0; i < array.length; i++) {
            arr_size1 = array[i].length;
            if (pos >= array[i].length) {
                pos = pos - array[i].length;
            } else {
                x = i;
                y = pos % array[i].length;
                break;
            }
        }
        cur++;
        return array[x][y];
    }

    public static void main(String[] args) {
        String[] array1 = {"Алексей", "Юрий", "Anna"};
        String[] array2 = {"Юля", "Саша", "Аня"};
        String[] array3 = {"Маша", "Дима", "John", "Лена"};
        String[][] array4 = {(array1), (array2), (array3)};
        MatrixIterator it = new MatrixIterator(array4);
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        if (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("");
        if (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("");
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
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
    }
}

