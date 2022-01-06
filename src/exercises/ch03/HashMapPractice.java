package exercises.ch03;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> studentsInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;
        String newName;


        System.out.println("Please enter students information: (enter any letters to exit.)");
        System.out.print("ID: ");

        do {
            newID = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            newName = input.nextLine();
            studentsInfo.put(newID, newName);

            System.out.print("ID: ");
        } while (input.hasNextInt());

        input.close();

        for ( Map.Entry<Integer, String> specificStudent : studentsInfo.entrySet() ) {
            System.out.println( "ID: " + specificStudent.getKey() + " with name: " + specificStudent.getValue() );
        }
    }

}
