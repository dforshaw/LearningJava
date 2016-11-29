package com.pluralsight.javafundamentals.javalanguage_jimwilson.contructscontrolflow.variablesdatatypesoperators;

public class mathOperators {
    public static void main(String[] args) {
        int iNum1, iNum2;
        double dNum1, dNum2;

        iNum1 = 5;
        iNum2 = 2;
        dNum1 = 6.0;
        dNum2 = 3.0;

        System.out.println(iNum1 + iNum2);
        System.out.println(iNum1 - iNum2);
        System.out.println(iNum1 * iNum2);
        System.out.println(iNum1 / iNum2);
        System.out.println(iNum1 % iNum2);
        System.out.println();
        System.out.println(dNum1 + dNum2);
        System.out.println(dNum1 - dNum2);
        System.out.println(dNum1 * dNum2);
        System.out.println(dNum1 / dNum2);
        System.out.println(dNum1 % dNum2);
        System.out.println();
        System.out.println(iNum1 + dNum2);
        System.out.println(iNum1 - dNum2);
        System.out.println(iNum1 * dNum2);
        System.out.println(iNum1 / dNum2);
        System.out.println();
        System.out.println(dNum1 + iNum2);
        System.out.println(dNum1 - iNum2);
        System.out.println(dNum1 * iNum2);
        System.out.println(dNum1 / iNum2);
    }
}
