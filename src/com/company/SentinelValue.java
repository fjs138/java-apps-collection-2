package com.company;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("This program will allow you to enter a series of numbers.");
        System.out.println("When you are finished, it will add them together.");
        String enterInteger = "Enter an integer (the input ends if it is 0: ";


        System.out.println(enterInteger);
        int data = keyboardInput.nextInt();

        int sum = 0;
        while (data !=0) {
            sum += data;
            System.out.println(enterInteger);
            data = keyboardInput.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
