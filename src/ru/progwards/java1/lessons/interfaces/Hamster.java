package ru.progwards.java1.lessons.interfaces;

public class Hamster extends Animal {

    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }

    public static void main(String[] args) {
        Hamster boy = new Hamster(1.5);
        System.out.println(boy.toString());
        System.out.println(boy.toStringFull());
    }
}
