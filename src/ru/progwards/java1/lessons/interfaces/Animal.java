package ru.progwards.java1.lessons.interfaces;

public class Animal implements FoodCompare, CompareWeight{
    private double weight;

    public Animal(double weight){
        this.weight = weight;
    }
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }
    @Override
    public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    //вычисляем вес корма для животного в зависимости от его веса
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
    // сравнение животных по весу
    @Override
    public boolean equals(Object anObject){
        if(this == anObject) return true;
        if(anObject == null || getClass() != anObject.getClass()) return false;
        Animal animal = (Animal) anObject;
        if(this.getWeight() == ((Animal) anObject).getWeight()) return true;
        else return false;
    }

            //информация о цене 1 кг еды
    public double getFood1kgPrice() {

        switch (getFoodKind()) {
            case HAY:
                return 20.0;
            case CORN:
                return 50.0;
            case UNKNOWN:
                return 0.0;
        }
        return 0.0;
    }

        //возвращаем стоимость еды для животного в зависимости от его веса и типа
        public double getFoodPrice() {
            return calculateFoodWeight() * getFood1kgPrice();
        }

    @Override
    public int compareFoodPrice(Animal animal){
    return Double.compare(this.getFoodPrice(),animal.getFoodPrice());
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        Animal prm = (Animal) smthHasWeigt;
        if (getWeight() < ((Animal) smthHasWeigt).getWeight()) return CompareResult.LESS;
        else if (getWeight() == ((Animal) smthHasWeigt).getWeight()) return CompareResult.EQUAL;
        else return CompareResult.GREATER;
    }

            public static void main (String[]args){
                Animal dog = new Animal(25.0);
                Hamster bich = new Hamster(26.0);
                Duck skruge = new Duck(20.0);
                Animal cat = new Animal(20.0);
                System.out.println(cat.toString());
                System.out.println(dog.toStringFull());
                System.out.println(AnimalKind.DUCK.equals(AnimalKind.HAMSTER));
                System.out.println(cat.equals(dog));
                System.out.println(bich.equals(skruge));
                System.out.println(skruge.toStringFull());
                System.out.println(bich.toStringFull());
                System.out.println(skruge.getFoodPrice());
                System.out.println(bich.getFoodPrice());
                System.out.println(skruge.compareFoodPrice(bich));
                System.out.println(skruge.compareWeight(bich));
            }

}