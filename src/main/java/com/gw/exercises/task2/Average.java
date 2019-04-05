package com.gw.exercises.task2;
import java.util.Scanner;

public class Average {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("1st number: ");
        int a = reader.nextInt();
        System.out.println("2nd number: ");
        int b = reader.nextInt();
        System.out.println("3rd number: ");
        int c = reader.nextInt();
        // For more universal use we can pack all values to array and divide it
        // to array.length-1 in next expression
        double average = (double) (a+b+c) / 3;
        reader.close();
        System.out.println("The average of entered numbers is: " + average);
    }
}
