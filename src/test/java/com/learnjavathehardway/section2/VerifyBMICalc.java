package com.learnjavathehardway.section2;

import org.junit.Test;

import static com.learnjavathehardway.section2variablesandinputs.BmiCalculator.bmiCalcImperial;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by david on 7/21/16.
 */
public class VerifyBMICalc {

    public static int INCHES_IN_A_FOOT = 12;

    @Test
    public void Test_Imperial_Calc_For_BMI() {

        int height_feet= 5;
        int height_inches= 4;
        int total_height = (INCHES_IN_A_FOOT * height_feet) + height_inches;
        int weight= 227;
        double bmi_goal = 27.5;

        double bmi = bmiCalcImperial(total_height,weight);

        System.out.println(bmi);


        for (int i = -3 ; i < 17 ; i++) {

            Double temp_bmi = bmi_goal + i;

            Double ow = (temp_bmi * Math.pow(total_height, 2))/ 703 ;

            System.out.println("To reach a BMI goal of " + temp_bmi + " you need to weigh " + ow.toString());
        }

        assertThat(bmi, is(38.960205078125));
    }
}
