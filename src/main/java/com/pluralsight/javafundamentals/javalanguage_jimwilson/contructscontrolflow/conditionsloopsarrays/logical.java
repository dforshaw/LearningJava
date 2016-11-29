package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.conditionsloopsarrays;

public class logical {
    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        if (rooms > 0 && students / rooms > 30)  // right sided did not execute with &&
            System.out.println("Crowded!!");



        System.out.println();
        System.out.println("** end program **");
    }
}
