package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.conditionsloopsarrays;

public class arraysForEach {
    public static void main(String[] args) {

        // example 1

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        float sum = 0.0f;

        for (int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);


        // example 2 - different way to initialize array

        float[] theVals2 = {10.0f, 20.0f, 15.0f};
        float sum2 = 0.0f;

        for (int i = 0; i < theVals2.length; i++)
            sum2 += theVals2[i];

        System.out.println(sum2);


        // example 3 - use for-each loop

        float[] theVals3 = {10.0f, 20.0f, 15.0f};
        float sum3 = 0.0f;

        for (float currentVal : theVals3)
            sum3 += currentVal;

        System.out.println(sum3);
    }
}
