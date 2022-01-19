package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private int courseCredits;
    private ArrayList<String> enrolledStudents;
    private HashMap<String, String> syllabus;

    public void setCourseName( String aCourseName) { courseName = aCourseName; }

    public void setCourseCredits( int aCourseCredits) { courseCredits = aCourseCredits; }

    public void setEnrolledStudents( ArrayList<String> aEnrolledStudents) { enrolledStudents = aEnrolledStudents; }

    public void setSyllabus( HashMap<String, String> aSyllabus) { syllabus = aSyllabus; }

    public String getCourseName() { return courseName; }

    public int getCourseCredits() { return courseCredits; }

    public ArrayList<String> getEnrolledStudents() { return enrolledStudents; }

    public HashMap<String, String> getSyllabus() { return syllabus; }
}
