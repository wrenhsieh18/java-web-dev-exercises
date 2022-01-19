package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits >= 0 && numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits >= 60 && numberOfCredits <= 89) {
            return "junior";
        } else if (numberOfCredits >= 90) {
            return "Senior";
        } else {
            return "Error! Invalid number of credits. Please check!";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        gpa = (gpa * numberOfCredits + courseCredits * grade)/(numberOfCredits + courseCredits);
        numberOfCredits += courseCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return name + " with student ID " + studentId + " earned " + numberOfCredits + " credits " + " with GPA " + gpa + ".";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (!(toBeCompared instanceof Student)) return false;
        Student student = (Student) toBeCompared;
        return getStudentId() == student.getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId());
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
