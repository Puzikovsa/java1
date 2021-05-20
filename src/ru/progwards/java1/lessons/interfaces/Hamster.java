package ru.progwards.java1.lessons.interfaces;

import ru.progwards.java1.lessons.classes.Animal;
import ru.progwards.java1.lessons.classes.AnimalKind;
import ru.progwards.java1.lessons.classes.FoodKind;

public class Hamster extends Animal {

    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public ru.progwards.java1.lessons.classes.AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    @Override
    public ru.progwards.java1.lessons.classes.FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }

    public static void main(String[] args) {
        Hamster boy = new Hamster(1.5);
        System.out.println(boy.toString());
    }
}
