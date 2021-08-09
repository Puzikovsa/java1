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
        indexList.add(min);
        indexList.add(min + 1);
        return indexList;
    }
    public static Collection<Integer> findLocalMax(Collection<Integer> numbers){
        List<Integer> number = new ArrayList<>(numbers);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number.size() - 1; i++){
            if(number.get(i - 1) < number.get(i) & number.get(i) > number.get(i + 1)){
                result.add(number.get(i));
            }
        }
        return result;
    }

    public static boolean findSequence(Collection<Integer> numbers) {
        boolean res = false;
        List<Integer> col = new ArrayList<>();
        for (int i = 1; i <= numbers.size(); i++) {
            col.add(i);
        }
        if (numbers.containsAll(col)) {
            res = true;
        }
        return res;
    }

    public static String findSimilar(Collection<String> names) {
        List<String> name = new ArrayList<>(names);
        List result = new ArrayList();
        List<Integer> num = new ArrayList<>();
        int number = 1;
        String res = "";
        for (int i = 0; i < name.size() - 2; i++) {
            if(name.get(i).equals(name.get(i + 1))){
                number = number + 1;
                result.add(name.get(i));
                num.add(number);
            } else
                if (name.get(i + 1).equals(name.get(i + 2))) {
                    number = 1;
                    result.add(name.get(i + 2));
                    num.add(number);
                } else break;
        }
        System.out.println(result);
        System.out.println(num);
        for (int j = 0; j < num.size(); j++){
            int max = num.get(j);
            if (Collections.max(num).equals(max)){
                res = result.get(j) + ":" + num.get(j);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        num.add(15);
        num.add(18);
        num.add(-111);
        num.add(11);
        num.add(34);
        num.add(11);
        num.add(24);
        num.add(-24);
        num.add(32);
        System.out.println(num);
        System.out.println(findLocalMax(num));
        System.out.println(findSequence(num));
        List<String> strName = new ArrayList<>();
        strName.add("Yura");
        strName.add("Yura");
        strName.add("Yura");
        strName.add("Yura");
        strName.add("Vasya");
        strName.add("Vasya");
        strName.add("Olga");
        strName.add("Olga");
        strName.add("Olga");
        strName.add("Maxim");
        strName.add("yulia");
//        System.out.println(num);
//        System.out.println(findSequence(num));
        System.out.println(strName);
        System.out.println(findSimilar(strName));
    }
}
