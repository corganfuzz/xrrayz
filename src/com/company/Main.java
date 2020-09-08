package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void copingArrays() {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];

        for (int i=0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.println(Arrays.toString(targetArray));
    }

    static void printMax(double... numbers) {

    }

    static int[] reverse(int[] list) {

        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        System.out.println(Arrays.toString(result));
        return result;

    }

    static void simplyMonths() {
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September",
                "October", "November", "December"};
        System.out.print("Enter a month number (1 to 12): ");
        Scanner input = new Scanner(System.in);
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }

    static void ex() {
        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println(" The size of numbers is " + numbers.length);
    }

    static void analyzingNumbers() {
        System.out.print("Enter the number of items: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double[] numbers = new double[n];   // Declaring an array of integer that depends on input
        double sum = 0;    // Initializing sum

        System.out.print("Enter the numbers (double): ");
        // Grabbing the numbers from the second input and adding them together

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // Performing the average
        double average = sum / n;

        int averageCount = 0; // Finding the numbers of elements above average

        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                averageCount++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above average is " + averageCount);
    }


    public static void main(String[] args) {
        int [] list = {1,2,3,5,4};
        reverse(list);
//        simplyMonths();
//        ex();
//        analyzingNumbers();
//        copingArrays();
    }
}
