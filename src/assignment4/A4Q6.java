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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asking the user to enter the speed limit
        Scanner input = new Scanner(System.in);
        System.out.println("What is the speed limit?");
        double limit = input.nextDouble();

        //asking the user to enter what speed they were going
        System.out.println("What is the speed of the vehicle?");
        double speed = input.nextDouble();

        //if the user is not speeding then is thanks then for not speeding
        if (speed <= limit) {
            System.out.println("Thank you for not speeding!");
        }
        //determines how much the user is speeding by
        double speeding = speed - limit;
        //if the user is speeding it determines the appropriate fine, and tells them
        if (speed > limit) {
            if (0 < speeding && speeding <= 20) {
                System.out.println("You are speeding, and your fine is $100");
            }
            if (20 < speeding && speeding <= 30) {
                System.out.println("You are speeding, and your fine is $270");
            }
            if (30 < speeding) {
                System.out.println("You are speeding, and your fine is $500");
            }
        }
    }
}
