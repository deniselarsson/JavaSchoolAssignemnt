package com.ecutbildning.javagrund;

import java.util.Scanner;

public class Exercise1 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int sum;
        double total;

        System.out.println("Please enter a number:");
        number = scan.nextInt();
        System.out.println("Please enter a sum:");

        sum = scan.nextInt();

        // Add tal to sum
        total = number + sum;
        System.out.println("Additionen: " + total);

        // Multiply by 2
        total = sum * 2;
        System.out.println("Multiplication: " + total);

        // divided by 2
        total = sum / 2;
        System.out.println("Dvision: " + total);

        // subtraction
        total = sum - number;
        System.out.println("Subtraction: " + total);
    }
}

