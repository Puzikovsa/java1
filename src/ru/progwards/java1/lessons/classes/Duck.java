package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{

    public Duck(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return AnimalKind.DUCK;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }

    public static void main(String[] args) {
        Duck donald = new Duck(0.5);
        System.out.println(donald.toString());
        System.out.println(donald.toStringFull());
    }
}
