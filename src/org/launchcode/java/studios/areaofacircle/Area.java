package org.launchcode.java.studios.areaofacircle;

public class Area {

    public static void main(String[] args) {
        double radius = ValidInput.promptPositiveNum();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
    }
}
