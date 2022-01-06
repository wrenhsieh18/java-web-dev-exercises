package exercises.ch03;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        Integer[] ranArray = {1, 1, 2, 3, 5, 8};

        System.out.println("Print out all the numbers.");
        for (Integer i : ranArray) {
            System.out.println(i);
        }

        System.out.println("Only print out all the odd numbers.");
        for (Integer i : ranArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String givenString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String stringWOMarks = givenString.replace(",","");
        stringWOMarks = stringWOMarks.replace(".","");
        String[] eachWord = stringWOMarks.split(" ");
        System.out.println(Arrays.toString(eachWord));

        String[] eachSentence = givenString.split("\\.");
        System.out.println(Arrays.toString(eachSentence));

    }
}
