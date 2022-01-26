package exercises.technology;

import java.util.ArrayList;
import java.util.Random;

public abstract class AbstractEntity {

    private String uniquId;
    private static ArrayList<String> usedID = new ArrayList<>();

    public String getUniquId() {
        return uniquId;
    }

    public void setUniquId() {
        String ranID = "";
        do {
            for (int i = 0; i < 15; i++) {
                if (i < 5) {
                    ranID += getRandomCapitalizedLetter();
                } else {
                    ranID += getRandomNumber();
                }
            }
            if (usedID.contains(ranID)) {
                ranID = "";
            }
        } while (ranID == "");
        usedID.add(ranID);
        uniquId = ranID;
    }

    public void setUniquId(String manualID) {
        if (usedID.contains(manualID)) {
            manualID = "";
            setUniquId();
        } else {
            usedID.add(manualID);
            uniquId = manualID;
        }
    }

    public void addUsedIDUniquId(String uniquId) {
        this.usedID.add(uniquId);
    }

    private int getRandomNumber(int max) {
        Random r = new Random();
        return (char) (r.nextInt(max));

    }

    private int getRandomNumber() {
        return getRandomNumber(10);

    }

    private char getRandomCapitalizedLetter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'A');
    }

}
