package com.company;
import java.util.Scanner;

/**
 * incomplete
 */

public class ComputeAndInterpretBMI {
    public static void main (String[] args) {

        System.out.println("Welcome to the BMI Calculator!");
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter weight in pounds
        System.out.println("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        //Prompt the user to enter the height in inches
        System.out.println("Enter the height in inches: ");
        double height = input.nextDouble();

        // Constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }

}
