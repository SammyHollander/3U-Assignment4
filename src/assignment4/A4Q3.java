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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asks the user to input 4 numbers
        System.out.println("please input four numbers (press enter between each number)");

        //the user input for the four numbers
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        //displaying the four numbers the user input
        System.out.println("Your numbers were; " + num1 + ", " + num2 + ", " + num3 + ", and" + num4);
    }
}
