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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //asking the student for their name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        //asking the student what the first test was out of and what mark they got
        System.out.println("What was the first test out of?");
        double test1Total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test1Mark = input.nextDouble();

        //calculateing the average for the first test
        double average1 = (test1Mark / test1Total) * 100;

        //asking the student what the second test was out of and what mark they got
        System.out.println("What was the second test out of?");
        double test2Total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test2Mark = input.nextDouble();

        //calculateing the average for the second test
        double average2 = (test2Mark / test2Total) * 100;

        //asking the student what the third test was out of and what mark they got
        System.out.println("What was the third test out of?");
        double test3Total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test3Mark = input.nextDouble();

        //calculateing the average for the thrid test
        double average3 = (test3Mark / test3Total) * 100;

        //asking the student what the fourth test was out of and what mark they got
        System.out.println("What was the fourth test out of?");
        double test4Total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test4Mark = input.nextDouble();

        //calculateing the average for the fourth test
        double average4 = (test4Mark / test4Total) * 100;

        //asking the student what the fifth test was out of and what mark they got
        System.out.println("What was the fifth test out of?");
        double test5Total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test5Mark = input.nextDouble();

        //calculateing the average for the fifth test
        double average5 = (test5Mark / test5Total) * 100;

        //telling the student what they got on each test
        System.out.println("Test 1: " + average1 + "%");
        System.out.println("Test 2: " + average2 + "%");
        System.out.println("Test 3: " + average3 + "%");
        System.out.println("Test 4: " + average4 + "%");
        System.out.println("Test 5: " + average5 + "%");

        //calculateing the student's overall average
        double totalAverage = (average1 + average2 + average3 + average4 + average5) / 5;

        //telling the student their overall average
        System.out.println(name + "'s overall average is:" + totalAverage + "%");


    }
}
