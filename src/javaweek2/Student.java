/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek2;

/**
 *
 * @author burge
 */
public class Student {
    private String name;
    private String studentID;
    private String programName;

    /**
     * A constructor that takes in both parameters
     * @param givenName - the student's name
     * @param givenID - the student's ID
     */
    public Student(String givenName, String givenID)
    {
        this.name = givenName;
        this.studentID = givenID;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        this.name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return this.studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student
     * studied and false otherwise.
     * @return whether or not the student studied
     */
    public boolean didStudy()
    {
        return true;
    }

    /**
     * @return the programName
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName the programName to set
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
}
