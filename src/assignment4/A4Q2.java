/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author holls9719
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // asking the user to input a measurement in inches
        System.out.println("Please enter a measurement in inches to be converted to cm");

        //the user input for the number of inches
        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();

        //multiply the number of inches by 2.54 to convert to centimeters
        double product = 2.54 * inches;

        //tells the user how many inches they started with, and the number of cm it equals
        System.out.println(inches + " inches is " + product + " cm.");
    }
}
