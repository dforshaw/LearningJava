package com.programmingbydoing.section3keyboardinput;

import java.util.Scanner;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 17
 */

public class MoreUserInputData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName, login;
        Integer grade, studentID;
        double gpa;

        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println("\n");
        System.out.print("First name: ");
        firstName = keyboard.next();
        System.out.print("Last name: ");
        lastName = keyboard.next();
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        studentID = keyboard.nextInt();
        System.out.print("Login: ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("\n");
        System.out.println("Your information:");
        System.out.println("\t\tLogin:\t" + login);
        System.out.println("\t\tID:\t\t" + studentID);
        System.out.println("\t\tName:\t" + lastName + ", " + firstName);
        System.out.println("\t\tGPA:\t" + gpa);
        System.out.println("\t\tGrade:\t" + grade);
    }
}
