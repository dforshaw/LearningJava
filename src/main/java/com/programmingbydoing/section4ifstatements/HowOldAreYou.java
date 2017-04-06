package com.programmingbydoing.section4ifstatements;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 22
 */

public class HowOldAreYou {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;

        System.out.println("Hey, what's your name?");
        name = keyboard.next();

        System.out.println("\nOK, " + name + ", how old are you?");
        age = keyboard.nextInt();

        if ( age < 16 ) {
            System.out.println("You can't drive, " + name + ".");
        }

        if ( age < 18 ) {
            System.out.println("You can't vote, " + name + ".");
        }

        if ( age < 25 ) {
            System.out.println("You can't rent a car, " + name + ".");
        }

        if ( age >= 25 ) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
    }
}
