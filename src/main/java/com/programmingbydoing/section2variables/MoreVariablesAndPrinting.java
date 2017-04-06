package com.programmingbydoing.section2variables;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 10
 */

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        final double INCHES_TO_CM = 2.54;
        final double POUNDS_TO_KILOGRAMS = 0.453592;

        Name = "David A. Forshaw";
        Age = 46;     // not a lie
        Height = 64;  // inches
        Weight = 230; // lbs
        Eyes = "Brown";
        Teeth = "White";
        Hair = "Black";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + Height + " inches (or " + (Height * INCHES_TO_CM) + " cm) tall.");
        System.out.println("He's " + Weight + " pounds (or " + (Weight * POUNDS_TO_KILOGRAMS) + " kg) heavy.");
        System.out.println("Actually, that's too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        // This line is tricky; try to get it exactly right.
        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + ".");
    }
}
