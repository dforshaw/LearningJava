package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.conditionsloopsarrays;

public class conditionalLogic {
    public static void main(String[] args) {

        /* Relational Operators
           >
           >=
           <
           <=
           ==
           !=
        */

        /* Conditional Assignment */

        int v1 = 7;
        int v2 = 7;
        int diff = 0;

        int vMax = v1 > v2 ? v1 : v2;

        System.out.println(vMax);


        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println(studentsPerRoom);


        if (v1 > v2)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is NOT bigger");


        if (v1 > v2)
            System.out.println("v1 is bigger");
        else if (v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");


        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        }
        else if (v1 < v2) {
            diff = v2 - v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        }
        else
            System.out.println("v1 and v2 are equal");
    }

}
