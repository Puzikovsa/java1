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
    public static Collection<Integer> findLocalMax(Collection<Integer> numbers){
        List<Integer> number = new ArrayList<>(numbers);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number.size() - 1; i++){
            if(number.get(i - 1) < number.get(i) || number.get(i) > number.get(i + 1)){
                result.add(number.get(i));
            }
        }
        return result;
    }

    public static boolean findSequence(Collection<Integer> numbers) {
        boolean res = false;
        for (int i = 1; i <= numbers.size(); i++) {
            if (numbers.contains(i)) {
                res = true;
                break;
            }
        }
        return res;
    }

//    public static String findSimilar(Collection<String> names){
//
//    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        num.add(15);
        num.add(18);
        num.add(1);
        num.add(11);
        num.add(34);
        num.add(11);
        num.add(24);
        System.out.println(num);
        System.out.println(findSequence(num));
    }
}
