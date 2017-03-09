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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //telling the player what game it is
        System.out.println("Welcome to snakes and ladders!");
        System.out.println("Have fun playing this single player digital version of the game");

        //setting the player to square 1 to start
        int space = 1;

        //telling the player that if they want to quit, enter 0
        System.out.println("If you wish to quit, enter zero instead of the sum of your dice roll");

        while (space < 100) {
            //asks the user to input the roll of the dice
            System.out.println("Roll two dice and enter their sum");
            int roll = input.nextInt();

            //if the roll is greater than 12, or equal to one (the max sum of two dice) it tells the player to re-enter the roll
            while (1 == roll || roll > 12) {
                System.out.println("I'm sorry, but it is impossible to roll a " + roll + " with two dice.");
                System.out.println("please enter a valid dice sum");
                roll = input.nextInt();
                //if they enter a zero, end the game because they quit
                if (roll == 0) {
                    break;
                }
            }
            //determineing what space the user ends up on at the end of the move
            space = space + roll;

            //if the player would end up on a space greater than 100, don't move the peice
            if (space > 100) {
                space = space - roll;
                System.out.println("Peice was unable to move due to landing on a space greater than 100.");
                System.out.println("Please roll again");
            } else //following three if statements are for when the player lands on the snakes
            if (space == 54) {
                space = 19;
                System.out.println("You landed on a snake! You are now on space 19");
            } else if (space == 90) {
                space = 48;
                System.out.println("You landed on a snake! You are now on space 48");
            } else if (space == 99) {
                space = 77;
                System.out.println("You landed on a snake! You are now on space 77");
            }//following if statements are for when the player lands on the ladders 
            else if (space == 9) {
                space = 34;
                System.out.println("You landed on a ladder! You are now on space 34");
            } else if (space == 40) {
                space = 64;
                System.out.println("You landed on a ladder! You are now on space 64");
            } else if (space == 67) {
                space = 86;
                System.out.println("You landed on a ladder! You are now on space 86");
            } //if they enter a zero, end the game because they quit
            else if (roll == 0) {
                System.out.println("You Quit!");
                break;
            }//tells the player what space they landed on 
            else {
                System.out.println("You are now on space " + space);
            }

        }
        //telling the player they one the game when they reach space 100
        if (space == 100) {
            System.out.println("Congradulations! You won the game!");
        }

    }
}
