package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        double r = 6371.2;
        return 4.0 / 3.0 * 3.14 * r * r * r;
    }
    public static float volumeBallFloat(float radius){
        float r = 6371.2f;
        return 4.0f / 3.0f * 3.14f * r * r * r;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallFloat(6371.2f) - volumeBallDouble(6371.2);
    }
    public static void main(String[] args) {
        System.out.println(calculateAccuracy(6371.2));
    }

}
