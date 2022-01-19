package studio03;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String givenStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<String, Integer> report = searchMethods.search(givenStr, 0, 1);

        searchMethods.printHashMap(report);

//        System.out.println("Enter a text: ");
//        String userSample = input.nextLine();
//        System.out.println("Case-sensitive (0) or Case-insensitive (1)? ");
//        Integer userChoice = input.nextInt();
//        System.out.println("Don't count special characters (0) or count special characters (1)? ");
//        Integer userSpeChar = input.nextInt();
//
//        HashMap<String, Integer> userReports = searchMethods.search(userSample, userChoice, userSpeChar);
//
//        searchMethods.printHashMap(userReports);

        String filePath = "src/studio03/text";
        File myObj = new File(filePath);
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }


        JFileChooser chooser = new JFileChooser();

        //FileNameExtensionFilter filter = new FileNameExtensionFilter(
                //"JPG & GIF Images", "jpg", "gif");

        //chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
        }

    }

}













