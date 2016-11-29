package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.variablesdatatypesoperators;

public class typeConversion {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result0 = byteVal;                        // converting to a wider type

//        short result1 = longVal;
        short result1 = (short) longVal;                // narrowing needs cast

//        short result2 = byteVal - longVal;
        short result2 = (short) (byteVal - longVal);    // need to cast entire calc

//        long result3 = longVal - floatVal;
        float result3 = longVal - floatVal;             // changed type of result3

//        float result3b = longVal - doubleVal;         // including double causes error
        double result3b = longVal - doubleVal;          // changed type of result3b

//        long result4 = shortVal - longVal + floatVal + doubleVal;
        long result4 = (long)(shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success");
    }
}
