package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Basics: Basic Syntax and Structure
        System.out.println("Hello, World!"); // Basic output

        // Variables and Data Types
        int age = 25; // int data type
        float height = 5.9f; // float data type
        double weight = 72.5; // double data type
        char initial = 'J'; // char data type
        boolean isStudent = true; // boolean data type

        // Type Casting
        double salary = 50000.75;
        int roundedSalary = (int) salary; // Casting from double to int
        System.out.println("Rounded Salary: " + roundedSalary);

        // Basic Control Structures
        // Conditional Statements
//        + plus
//        - min
//        *
//        /
//        >
//        <
//        ==
//        >=
//        <=
        if (age > 18) {
            System.out.println("You are an adult.");
        } else if (age == 18) {
            System.out.println("Sweet 18 birthday!");
        } else if (age == 17) {
            System.out.println("Sweet 17 birthday!");
        } else {
            System.out.println("You are not an adult.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your age is: ");
        age = scanner.nextInt(); // Reading an integer input
        switch (age) {
            case 18:
                System.out.println("Sweet 18 birthday!");
                break;
            case 17:
                System.out.println("Sweet 17 birthday!");
                break;
            default:
                System.out.println("You are not an adult.");
                break;
        }

        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("It's the start of the week.");
                break;
            case "Friday":
                System.out.println("It's almost the weekend.");
                break;
            default:
                System.out.println("It's a regular day.");
                break;
        }

        // Loops
        // For loop
        System.out.println("For loop example:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        System.out.println("While loop example:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        System.out.println("Do-while loop example:");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 2);

        // Basic Input and Output


        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reading user input
        System.out.println("Hello, " + name + "!"); // Output user input

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt(); // Reading an integer input
        System.out.println("You are " + userAge + " years old.");

        // Closing the scanner
        scanner.close();
    }
}