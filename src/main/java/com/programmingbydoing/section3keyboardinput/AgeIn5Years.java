package com.programmingbydoing.section3keyboardinput;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 18
 */

public class AgeIn5Years {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = "";
        Integer age = 0;

        System.out.print("Hello. What is your name? ");
        name = keyboard.next();

        System.out.print("\nHi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("\nDid you know that in five years you will be " + (age + 5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
