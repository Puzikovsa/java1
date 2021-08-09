package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Finder {

    public static Collection<Integer> findMinSumPair(Collection<Integer> numbers) {

        List<Integer> result = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        List<Integer> number = new ArrayList<>(numbers);
        int min = 0;
        for (int i = 1; i < number.size() - 1; i++) {
            result.add(number.get(i - 1) + number.get(i));
                if (Collections.min(result).equals(number.get(i - 1) + number.get(i))) {
                    min = i - 1;
            }
        }
        System.out.println(min);
        indexList.add(min);
        indexList.add(min + 1);
        return indexList;
    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        num.add(0);
        num.add(3);
        num.add(6);
        num.add(1);
        num.add(2);
        num.add(11);
        num.add(24);
        System.out.println(num);
        System.out.println(findMinSumPair(num));
    }
}
