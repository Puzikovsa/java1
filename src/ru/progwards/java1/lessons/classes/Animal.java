package ru.progwards.java1.lessons.classes;

public class Animal {
    private double weight;

    public Animal(double weight){

        this.weight = weight;
    }
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
        return FoodKind.UNKOWN;
    }
    @Override
    public String toString(){
        return "I am " + getKind() + " , eat " + getFoodKind();
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public String toStringFull(){
        return "I am " + getKind() + " , eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public static  void main(String[] args) {
        Animal dog = new Animal(50.0);
        System.out.println(dog.toString());
        System.out.println(dog.toStringFull());
    }



}
