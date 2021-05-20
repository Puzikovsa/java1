package ru.progwards.java1.lessons.interfaces;

import ru.progwards.java1.lessons.classes.Animal;

public interface FoodCompare<animal> {
   public int compareFoodPrice(Animal animal);
}
