package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class ValidInput {

    public static Double promptPositiveNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double ranRadius = input.nextDouble();
        while (ranRadius <= 0) {
            System.out.println("Please enter a positive number!");
            System.out.println("Enter a radius: ");
            ranRadius = input.nextDouble();
        }
        input.close();
        return ranRadius;
    }
}
