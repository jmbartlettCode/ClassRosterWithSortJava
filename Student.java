/*
 * Josh Bartlett
 * March 28, 2020
 * Assignment 9.1
 * Bellevue University
 * Student.java
 */
public class Student {
    // Declare variables for use in Student class
    private String lastName, firstName;
    private int id;
    // Constructor for Student object
    public Student(String lastName, String firstName, int id){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }
    // gets and sets for all data fields
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    // print method returns all elements of requested object from RosterManager print method
    public String print(){
        return (padRight(this.lastName, 20) + padRight(this.firstName, 20) + Integer.toString(this.id));
    }
    // padRight method to format display to be more readable
    private static String padRight(String str, int n) {
        // for loop adds spaces to the right of the string to make the string lengths all the same when displaying
        for (int i = str.length(); i < n; i++) {
            str += ' ';
        }
        return str;
    }
}
