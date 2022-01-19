package studio03;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

    public static void main(String[] args) {

        String givenStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        String givenStrWOSpeChar = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        givenStrWOSpeChar = givenStrWOSpeChar.toLowerCase().replaceAll("[^a-z]","");

        HashMap<Character, Integer> output = countCharacters(givenStrWOSpeChar);

        for (Map.Entry<Character, Integer> each : output.entrySet() ) {
            System.out.println(each.getKey() + ": " + each.getValue() );
        }
    }

    public static HashMap<Character, Integer> countCharacters(String givenTextPara) {

        char[] allChar = givenTextPara.toCharArray();

        HashMap<Character, Integer> reports = new HashMap<>();

        for (Character c : allChar) {
           if (reports.containsKey(c)) {
               reports.put(c, reports.get(c) +1);
           } else {
               reports.put(c, 1);
          }
        }

        return reports;
    }

}
