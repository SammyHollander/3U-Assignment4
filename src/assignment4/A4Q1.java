/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author holls9719
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //makeing text appear to ask for a name input
        System.out.println("Please enter your name");

        //user input for their name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //print the name that the person entered
        System.out.println("Hello " + name + ". What's up?");
    }
}
