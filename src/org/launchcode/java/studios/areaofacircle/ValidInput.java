package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class ValidInput {

    public static Double promptPositiveNum() {
        Scanner input = new Scanner(System.in);
        double ranRadius;

        do {
            System.out.println("Enter a radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please a valid number: ");
                input.next();
            }
            ranRadius = input.nextDouble();
        } while (ranRadius <= 0);

        input.close();
        return ranRadius;
    }
}
