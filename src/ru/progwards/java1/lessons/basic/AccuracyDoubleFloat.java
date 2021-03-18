package ru.progwards.java1.lessons.basic;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius) {
        return 4.0 / 3.0 * 3.14 * radius * radius * radius;
    }

    public static float volumeBallFloat(float radius) {
        return 4.0f / 3.0f * 3.14f * radius * radius * radius;
    }

    public static double calculateAccuracy(double radius) {
        return  volumeBallFloat(6371.2f) - volumeBallDouble(6371.2);
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(6371.2));
    }
}
