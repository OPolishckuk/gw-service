package com.gw.exercises.task2;
import java.util.Scanner;

public class Multiplier {
    public static void main (String[] args) {
        // 1) Write a program that accept two numbers from user input as method arguments and returns its multiplication
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        //here is a reason to make check either a user entered a number or string555
        int firstInput = reader.nextInt();
        System.out.println("Enter a 2nd number: ");
        int secondInput = reader.nextInt();
        reader.close();
        System.out.println(firstInput * secondInput);
    }
}
