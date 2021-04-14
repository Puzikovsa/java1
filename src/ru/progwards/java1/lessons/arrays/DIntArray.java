package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] array = {12, - 4, 0, 26, 68, -5};

    public DIntArray() {
    }
    public void add(int num){
        int[] arrayCopy = Arrays.copyOf(array,array.length +1);
        arrayCopy[arrayCopy.length - 1] = num;
        array = arrayCopy;
    }
    public void atInsert(int pos, int num){
        int[] arrayCopy = Arrays.copyOf(array, array.length + 1);
        for (int i = arrayCopy.length - 1; i > pos; i--){
            arrayCopy[i] = array[i - 1];
        }
        arrayCopy[pos] = num;
        array = arrayCopy;
    }
    public void atDelete(int pos){
        for (int i = pos; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
//        array[array.length -1] = 0;
        int[] arrayCopy = Arrays.copyOf(array, array.length - 1);
    }
    public int at(int pos){
        return array[pos];
    }

    public static void main(String[] args) {
        DIntArray d = new DIntArray();
        System.out.println("Befor: " + Arrays.toString(d.array));
        d.add(29);
        System.out.println("After: " + Arrays.toString(d.array));
        d.atInsert(4,17);
        System.out.println("After: " + Arrays.toString(d.array));
        d.atDelete(3);
        System.out.println("After: " + Arrays.toString(d.array));
        d.at(4);
        System.out.println("After: " + Arrays.toString(d.array));

    }
}