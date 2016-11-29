package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.conditionsloopsarrays;

public class loops {
    public static void main(String[] args) {

        // While Loop - approach 1

        int kVal = 5;
        int factorial = 1;

        while(kVal > 1) {
            factorial *= kVal;
            kVal -= 1;
        }

        System.out.println(factorial);

        // While Loop - approach 2

        kVal = 5;
        factorial = 1;

        while(kVal > 1) {
            factorial *= kVal--;
        }

        System.out.println(factorial);


        // Do-While Loop - approach 1

        int iVal = 5;

        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);


        // For Loop - approach 1

        int iVal2 = 1;

        while (iVal2 < 100) {
            System.out.println(iVal2);
            iVal2 *= 2;
        }

        // For Loop - approach 2

        for(int iVal3 = 1 ; iVal3 < 100 ; iVal3 *= 2)
            System.out.println(iVal3);

    }
}
