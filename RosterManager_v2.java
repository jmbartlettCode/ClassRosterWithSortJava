/*
 * Josh Bartlett
 * March 28, 2020
 * Assignment 9.1
 * Bellevue University
 * RosterManager_v2.java
 */
import java.util.*;

public class RosterManager_v2 {
    // Create a private List of Student objects for use in RosterManager class
    private List<Student> students;
    // Constructor for RosterManager object
    public RosterManager_v2(){
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        // Declare variables
        String add = "Y", lName, fName;
        int id;
        // Create a new LinkedList of Student objects
        List <Student> rosterList = new LinkedList<>();
        // Populate all elements for Student objects
        Student student1 = new Student("Avinaz", "Gabriel", 11);
        Student student2 = new Student("Bartlett", "Joshua", 25);
        Student student3 = new Student("Brisk", "Chaim", 63);
        Student student4 = new Student("Corrick", "Wesley", 22);
        Student student5 = new Student("Freer", "David", 86);
        Student student6 = new Student("Keita", "Mamoud", 87);
        Student student7 = new Student("Lam", "Gary", 49);
        Student student8 = new Student("Lara", "Daniel", 12);
        Student student9 = new Student("Maya Cigarroa", "Miguel", 74);
        Student student10 = new Student("McAllister", "Shawn", 23);
        Student student11 = new Student("Muniz-Torres", "Christian", 31);
        Student student12 = new Student("Seigel", "Martin", 13);
        Student student13 = new Student("Staley", "Jason", 30);
        Student student14 = new Student("Verderamo", "James", 42);
        Student student15 = new Student("Widger", "Brice", 26);
        // Add all Student objects to LinkedList
        rosterList.add(student1);
        rosterList.add(student2);
        rosterList.add(student3);
        rosterList.add(student4);
        rosterList.add(student5);
        rosterList.add(student6);
        rosterList.add(student7);
        rosterList.add(student8);
        rosterList.add(student9);
        rosterList.add(student10);
        rosterList.add(student11);
        rosterList.add(student12);
        rosterList.add(student13);
        rosterList.add(student14);
        rosterList.add(student15);
        // while loop to ask for student info, create new Student object, and to add to rosterList
        while(add.equals("Y")){
            System.out.println("Add a Student");
            System.out.print("Enter Last Name: ");
            lName = inputString.nextLine();
            System.out.print("Enter First Name: ");
            fName = inputString.nextLine();
            System.out.print("Enter Student ID Number: ");
            id = inputInt.nextInt();
            Student student = new Student(lName, fName, id);
            rosterList.add(student);
            System.out.print("Add another student? (Y/N): ");
            add = inputString.nextLine().toUpperCase();
        }
        // make students list equal to the rosterList LinkedList
        students = rosterList;
    }
    // Method to sort
    public void sortStudents(int sortBy){
        // Declare variable for use in sorting
        int smallest;
        // Declare a temp Student object to use in sorting
        Student temp;
        // for loop to sort and resets the smallest variable when moving to next object
        for(int i = 0; i < students.size(); i++){
            smallest = i;
            // Nested for loop to continue onto next field of object
            for(int j = i; j < students.size(); j++){
                // Declare Student object to use in sorting
                Student current = students.get(smallest);
                // switch statement based on what user chooses to have roster sorted by
                switch(sortBy){
                    case 1: // No sort
                        break;
                    case 2: // Sort roster by last name
                        String lastName = students.get(j).getLastName();
                        if (lastName.compareTo(current.getLastName()) < 0)
                            smallest = j;
                        break;
                    case 3: // Sort roster by first name
                        String firstName = students.get(j).getFirstName();
                        if (firstName.compareTo(current.getFirstName()) < 0)
                            smallest = j;
                        break;
                    case 4: // Sort roster by id
                        int id = students.get(j).getId();
                        if (id < current.getId())
                            smallest = j;
                        break;
                    case 5: // No sort no display
                        break;
                }
            }
            // Sort smallest to the top of list
            temp = students.get(i);
            students.set(i, students.get(smallest));
            students.set(smallest, temp);
        }
    }
    // print method called from Roster402 class
    public void print(){
        // for loop to go through and display all the objects in the list
        for(int i = 0; i < students.size(); i++){
            // Calls the print method from the Student class to display all elements of the objects in the list
            System.out.println(this.students.get(i).print());
        }
    }
}
