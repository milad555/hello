package org.example;

public class Rectangle {
    static void printRectangleArea(double a, double b) {
        System.out.println("Площадь квадрата со стороной " + a + "and" + b + " = " + rectangleArea(a,b));

    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }
}
