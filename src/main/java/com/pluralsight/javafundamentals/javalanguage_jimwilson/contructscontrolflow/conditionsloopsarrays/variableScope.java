package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.conditionsloopsarrays;

public class variableScope {
    public static void main(String[] args) {
        float students = 30.0f;
        float rooms = 4.0f;

        float avg2 = 0.0f;

        if (rooms > 0.0f) {
            System.out.println(students);
            System.out.println(rooms);
            float avg1 = students / rooms;
            avg2 = students / rooms;        }

//        System.out.println(avg1);        // gives compilation error due to scope
        System.out.println(avg2);
    }
}
