package exercises.ch03;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayListPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitGivenString = givenString.split(" ");
        ArrayList<String> fromArrayPractice = new ArrayList<>(Arrays.asList(splitGivenString));

        ArrayList<Integer> givenArrayList = new ArrayList<>();
        givenArrayList.add(-76);
        givenArrayList.add(53);
        givenArrayList.add(289);
        givenArrayList.add(-1298);
        givenArrayList.add(312);
        givenArrayList.add(4);
        givenArrayList.add(787);
        givenArrayList.add(13);
        givenArrayList.add(87);
        givenArrayList.add(-92);

        double totalSum = ArrayListMethods.getSumForArrayList(givenArrayList);
        System.out.println(totalSum);

        ArrayList<String> wordArrayList = new ArrayList<>();
        wordArrayList.add("apple");
        wordArrayList.add("orange");
        wordArrayList.add("pizza");
        wordArrayList.add("noodles");
        wordArrayList.add("water");
        wordArrayList.add("candy");
        wordArrayList.add("tofu");

        ArrayListMethods.printWordWithFiveLetters(wordArrayList, 5);

        System.out.print("Please enter the length of words you would like to search: ");
        Integer lengthForSearch = input.nextInt();
        ArrayListMethods.printWordWithFiveLetters(wordArrayList, lengthForSearch);

        System.out.print("Please enter the length of words you would like to search: ");
        lengthForSearch = input.nextInt();
        System.out.println(fromArrayPractice);
        ArrayListMethods.printWordWithFiveLetters(fromArrayPractice, lengthForSearch);
    }

}


