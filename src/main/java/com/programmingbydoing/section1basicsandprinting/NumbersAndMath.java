package com.programmingbydoing.section1basicsandprinting;

/**
 * Programming By Doing
 * http://programmingbydoing.com/
 * Exercise 8
 */

public class NumbersAndMath {
    public static void main(String[] args) {
        System.out.println("USING WHOLE NUMBERS");
        // printing text
        System.out.println("I will now count my chickens:");
        // (1) text & (2) math: 30/6=5 and then add to 25 = 30
        System.out.println("Hens " + (25 + 30/6));
        // (1) text & (2) math: 25*3=75 ; 75%4=3 ; 100-3=97
        System.out.println("Roosters " + (100 - 25 * 3 % 4));
        // printing text
        System.out.println("Now I will count the eggs:");
        // math: 4%2=0 ; 1/4=0 (whole #s) ; 3+2+1-5+0-0+6=7
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);
        // printing text
        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        // (1) math: 3+2=5 ; 5-7=-2 & (2) boolean: 5<-2 --> false
        System.out.println(3 + 2 < 5 - 7);
        // (1) text & (2) math: 3+2=5
        System.out.println("What is 3 + 2? " + (3 + 2));
        // (1) text & (2) math: 5-7=-2
        System.out.println("What is 5 - 7? " + (5 - 7));
        // printing text
        System.out.println("Oh, that's why it's false.");
        // printing text
        System.out.println("How about some more.");
        // (1) text & (2) boolean: 5>-2 --> true
        System.out.println("Is it greater? " + (5 > -2));
        // (1) text & (2) boolean: 5>=-2 --> true
        System.out.println("Is it greater or equal? " + (5 >= -2));
        // (1) text & (2) boolean: 5<=-2 --> false
        System.out.println("Is it less or equal? " + (5 <= -2));

        // Version 2 - using floating numbers
        System.out.println();
        System.out.println("USING FLOATING NUMBERS");
        // printing text
        System.out.println("I will now count my chickens:");
        // (1) text & (2) math: 30/6=5 and then add to 25 = 30
        System.out.println("Hens " + (25.0 + 30.0/6.0));
        // (1) text & (2) math: 25*3=75 ; 75%4=3 ; 100-3=97
        System.out.println("Roosters " + (100.0 - 25.0 * 3.0 % 4.0));
        // printing text
        System.out.println("Now I will count the eggs:");
        // math: 4%2=0 ; 1/4=0.25 (float #s) ; 3+2+1-5+0-0.25+6=7
        System.out.println(3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0);
        // printing text
        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        // (1) math: 3+2=5 ; 5-7=-2 & (2) boolean: 5<-2 --> false
        System.out.println(3.0 + 2.0 < 5.0 - 7.0);
        // (1) text & (2) math: 3+2=5
        System.out.println("What is 3 + 2? " + (3.0 + 2.0));
        // (1) text & (2) math: 5-7=-2
        System.out.println("What is 5 - 7? " + (5.0 - 7.0));
        // printing text
        System.out.println("Oh, that's why it's false.");
        // printing text
        System.out.println("How about some more.");
        // (1) text & (2) boolean: 5>-2 --> true
        System.out.println("Is it greater? " + (5.0 > -2.0));
        // (1) text & (2) boolean: 5>=-2 --> true
        System.out.println("Is it greater or equal? " + (5.0 >= -2.0));
        // (1) text & (2) boolean: 5<=-2 --> false
        System.out.println("Is it less or equal? " + (5.0 <= -2.0));
    }
}
