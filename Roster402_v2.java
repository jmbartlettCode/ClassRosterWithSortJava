/*
 * Josh Bartlett
 * March 28, 2020
 * Assignment 9.1
 * Bellevue University
 * Roster402_v2.java
 */
import java.util.*;

public class Roster402_v2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Declare variables
        String resort = "Y", sort;
        int sortBy;
        // Create object form RosterManager class that holds LinkedList
        RosterManager_v2 roster = new RosterManager_v2();
        // while loop to give user option to sort the LinkedList and display result and sort again
        while(resort.equals("Y")) {
            System.out.println("Sort and Display Roster By:\n1. No Sort\n2. Last Name\n3. First Name\n4. ID\n5. Exit");
            System.out.print("Enter the number for the sort you want or enter 4 to exit: ");
            sort = input.nextLine();
            if(!sort.equals("5")) {
                sortBy = Integer.parseInt(sort);
                // calls the sortStudents method from RosterManager class to be used with the created roster
                roster.sortStudents(sortBy);
                // Labels for the roster
                System.out.println("\nLast Name\t\t\tFirst Name\t\t\tID");
                // calls the print method from RosterManager class to display the sorted roster
                roster.print();
                // Asks user if they want to sort again and gets their
                System.out.print("\nSort Again(y/n): ");
                resort = input.nextLine().toUpperCase();
                System.out.println();
            }else
                resort = "N";
        }
    }
}
