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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //asking the user how much the food costs
        System.out.println("How much does the food cost?");
        Scanner input = new Scanner(System.in);
        double food = input.nextDouble();

        //asking the user how much the DJ costs
        System.out.println("How much does the DJ cost?");
        double DJ = input.nextDouble();

        //asking the user how much the hall costs
        System.out.println("What is the cost to rent the hall?");
        double hall = input.nextDouble();

        //asking the user how much the decorations cost
        System.out.println("How much do the decorations cost?");
        double decorations = input.nextDouble();

        //asking the user how much the staff costs
        System.out.println("How much does the staff cost?");
        double staff = input.nextDouble();

        //asking the user how much the misc costs
        System.out.println("How much do the miscelaneous items cost?");
        double misc = input.nextDouble();

        //adding all the costs of prom to get the total cost
        double totalCost = food + DJ + hall + decorations + staff + misc;

        //calculating the number of tickets needed to break even if each ticket must be $35
        double numberOfTickets = Math.ceil(totalCost / 35);

        //telling the user the total cost and the number of tickets they must sell to break even
        System.out.println("The total cost is $" + totalCost + ". The number of tickets needed to break even is, " + numberOfTickets);
    }
}
