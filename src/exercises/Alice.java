package exercises;

import java.util.Scanner;

public class Alice {

    public static void main (String[] Args) {
        String aliceSWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the keyword you would like to search for?");
        String keyword = input.nextLine().toLowerCase();
        input.close();

        if (aliceSWonderland.toLowerCase().contains(keyword)) {

            System.out.println("The word has " + keyword.length() + " letters and located at " + aliceSWonderland.toLowerCase().indexOf(keyword) + ".");

            String newAliceSWonderland = aliceSWonderland.toLowerCase().replace(keyword, "");
            newAliceSWonderland = newAliceSWonderland.replace("alice", "Alice");
            System.out.print(newAliceSWonderland);

        }   else {
            System.out.println("False");
        }

    }
}
