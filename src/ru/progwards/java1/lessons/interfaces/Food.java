package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class Food implements CompareWeight{
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        Food prm = (Food) smthHasWeigt;
        if(getWeight() < ((Food) smthHasWeigt).getWeight()) return CompareResult.LESS;
        else if(getWeight() > ((Food) smthHasWeigt).getWeight()) return CompareResult.GREATER;
        else return CompareResult.EQUAL;
    }
    public static void sort(CompareWeight[] a){
//        for(int i = 1; i < a.length; i++){
//            for(int j = 0; j < a.length; j++){
//                int per = a[i];
//                int per1 = a[j];
//                if (per < per1){
//                    a[i] = per1;
//                    a[j] = per;
//                }
//            }
        }

    public static void main(String[] args) {
        Food corn = new Food(100);
        Food proso = new Food(260);
        Food brad = new Food(150);
        System.out.println(proso.compareWeight(brad));
        int[] a = {6, 12, 26, 62, -6};
    }
}
