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

    public static void main(String[] args) {
        Food corn = new Food(100);
        Food proso = new Food(260);
        Food brad = new Food(150);
        System.out.println(proso.compareWeight(brad));
        System.out.println(corn.compareWeight(brad));

    }
}
