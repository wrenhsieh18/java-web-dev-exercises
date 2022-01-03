package exercises;
import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long is the width of the rectangle?");
        double width = input.nextDouble();
        System.out.println("How long is the length of the rectangle?");
        double length = input.nextDouble();
        input.close();
        double area = width * length;
        System.out.println("The are of the rectangle is " + area + ".");

    }

}
