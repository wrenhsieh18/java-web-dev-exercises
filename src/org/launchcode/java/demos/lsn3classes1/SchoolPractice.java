package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student aStudent = new Student();

        aStudent.setName("Wren");
        aStudent.setStudentId(57943);
        aStudent.setNumOfCredits(1);
        aStudent.setGpa(4.0);

        System.out.println("The student, " + aStudent.getName() + ", with student ID, " + aStudent.getStudentId() + ", earned " + aStudent.getNumOfCredits() + "credit in LC101 with GPA " + aStudent.getGpa() + ".");
    }
}
