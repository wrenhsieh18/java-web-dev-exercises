package exercises;
import java.util.Scanner;

public class MPG {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas has your vehicle consumed?");
        double gasConsumed = input.nextDouble();
        input.close();
        double mpg = milesDriven/gasConsumed;
        System.out.println("Your vehicle's MPG is " + mpg + ".");

    }
}
