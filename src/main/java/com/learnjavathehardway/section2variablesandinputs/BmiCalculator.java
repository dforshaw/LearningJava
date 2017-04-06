package com.learnjavathehardway.section2variablesandinputs;

import java.util.Scanner;

/**
 * Learn Java the Hard Way
 * https://learnjavathehardway.org/book/
 * Exercise 9
 *
 * BMI =   mass(kg) / pow(height(m),2)
 *     = [ mass(lb) / pow(height(in),2) ] * 703
 */

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Integer measurementMethod = 0;
        Integer imperialMethod = 0;
        double height = 0;
        int height_ft = 0;
        int height_in = 0;
        double weight = 0;
        double BMI = 0;

        System.out.print("Choose your measurement method.\nEnter (1) for Metric and (2) for Imperial: ");
        measurementMethod = keyboard.nextInt() ;

        // Metric
        if (measurementMethod == 1) {
            System.out.print("Your height: ");
            height = keyboard.nextDouble();

            System.out.print("Your weight: ");
            weight = keyboard.nextDouble();

            BMI = bmiCalcMetric(height, weight);
        }
        // Imperial
        else if (measurementMethod == 2) {
            System.out.print("Use (1) feet & inches or (2) inches only?: ");
            imperialMethod = keyboard.nextInt() ;

            // Feet / Inches
            if (imperialMethod == 1) {
                System.out.print("Your height (feet only): ");
                height_ft = keyboard.nextInt();

                System.out.print("Your height (inches): ");
                height_in = keyboard.nextInt();

                System.out.print("Your weight in pounds: ");
                weight = keyboard.nextDouble();

                BMI = bmiCalcImperial((height_ft * 12) + height_in, weight);
            }
            // Inches only
            else if (measurementMethod == 2) {
                System.out.print("Your height in inches: ");
                height_in = keyboard.nextInt();

                System.out.print("Your weight in pounds: ");
                weight = keyboard.nextDouble();

                BMI = bmiCalcImperial(height_in, weight);
            }
        }

        System.out.println("Your BMI is " + BMI);
    }

    public static double bmiCalcMetric(double height, double weight) {
        return weight / Math.pow(height,2);
    }

    public static double bmiCalcImperial(double height, double weight) {
        return (weight / Math.pow(height,2)) * 703;
    }
}

