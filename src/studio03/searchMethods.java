package studio03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class searchMethods {

    public static HashMap<String, Integer> search(String sampleInput, Integer option, Integer countSpecialChar) {
        ArrayList<String> sample = new ArrayList<>();

        String neededChars = "A B C D E F G H I J K L M N O P Q R S U V W X Y Z a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] allChars = neededChars.split(" ");
        ArrayList<String> charsNeededCaseSensative = new ArrayList<>(Arrays.asList(allChars));

        neededChars = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        allChars = neededChars.split(" ");
        ArrayList<String> charsNeededCaseInsensative = new ArrayList<>(Arrays.asList(allChars));

        HashMap<String, Integer> results = new HashMap<>();

        Integer sum;

        if (option == 0) {
            if (countSpecialChar != 0) {
                charsNeededCaseSensative.add(" ");
                charsNeededCaseSensative.add(",");
                charsNeededCaseSensative.add(".");
            }
            sample = new ArrayList<>(Arrays.asList(sampleInput.split("")));
            for (String i : charsNeededCaseSensative) {
                sum = 0;
                for (String j : sample) {
                    if (i.equals(j)) {
                        sum += 1;
                    }
                }
                if (sum != 0) {
                    results.put(i, sum);
                }
            }
        } else if (option == 1) {
            if (countSpecialChar != 0) {
                charsNeededCaseInsensative.add(" ");
                charsNeededCaseInsensative.add(",");
                charsNeededCaseInsensative.add(".");
            }
            sample = new ArrayList<>(Arrays.asList(sampleInput.toLowerCase().split("")));
            for (String i : charsNeededCaseInsensative) {
                sum = 0;
                for (String j : sample) {
                    if (i.equals(j)) {
                        sum += 1;
                    }
                }
                if (sum != 0) {
                    results.put(i, sum);
                }
            }
        }

        return results;

    }

    public static void printHashMap(HashMap<String, Integer> inputHashMap) {
        for (Map.Entry<String, Integer> each: inputHashMap.entrySet()) {
            System.out.println( each.getKey() + " : " + each.getValue());
        }
    }
}
