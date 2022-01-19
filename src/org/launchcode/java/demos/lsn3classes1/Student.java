package org.launchcode.java.demos.lsn3classes1;

public class Student {

    private String name;
    private int studentId;
    private int numOfCredits;
    private double gpa;

    public void setName(String aName) { name = aName; }

    public void setStudentId(int aStudentId) { studentId = aStudentId; }

    public void setNumOfCredits(int aNumOfCredits) { numOfCredits = aNumOfCredits; }

    public void setGpa(double aGpa) { gpa = aGpa; }


    public String getName() { return name; }

    public int getStudentId() { return studentId; }

    public int getNumOfCredits() { return numOfCredits; }

    public double getGpa() { return gpa; }


}
