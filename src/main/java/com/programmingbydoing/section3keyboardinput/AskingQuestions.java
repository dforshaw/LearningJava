package com.programmingbydoing.section3keyboardinput;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 14
 */

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String height_feet;
        String height_inches;
        double weight;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("How many feet tall are you? ");
        height_feet = keyboard.next();

        System.out.print("And how many inches? ");
        height_inches = keyboard.next();

        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + height_feet + " feet and " + height_inches + " inches tall and " + weight + " heavy.");
    }
}
