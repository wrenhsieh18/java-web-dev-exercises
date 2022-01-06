package exercises.ch03;

import java.util.ArrayList;

public class ArrayListMethods {
    public static double getSumForArrayList( ArrayList<Integer> arrayListArgs) {
        double sum = 0;
        for (Integer i : arrayListArgs) {
            sum += i;
        }
        return sum;
    }

    public static void printWordWithFiveLetters( ArrayList<String> arrayListArgs, Integer length) {
        for (String word : arrayListArgs) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
