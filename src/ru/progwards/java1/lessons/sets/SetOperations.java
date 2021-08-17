package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> result1 = new HashSet<>(set1);
        result1.retainAll(set2);
        return result1;
    }

    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2){
        return set1;
    }

    public static void main(String[] args) {
        Set<Integer> intSet1 = Set.of(1, 5, 12, -7, 25);
        Set<Integer> intSet2 = Set.of(7, 1, 5, 32, -9, -7);
        Set<Integer> unionSet = union(intSet1, intSet2);
        Set<Integer> interSet = intersection(intSet1, intSet2);
        System.out.println(intSet1);
        System.out.println(intSet2);
        System.out.println(unionSet);
        System.out.println(interSet);
    }
}
