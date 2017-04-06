package com.programmingbydoing.section3keyboardinput;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 16
 */

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        Integer age = 0;
        double salary = 0.0;

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("\nHi, " + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("\nSo you're " + age + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = keyboard.nextDouble();

        System.out.println("\n" + salary + "! I hope that's per hour and not per year! LOL!");
    }
}
