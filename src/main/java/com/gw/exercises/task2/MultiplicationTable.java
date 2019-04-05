package com.gw.exercises.task2;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        // 2)Write a program, that accepts one number from user and returns multiplication of that number from 1 to 10.
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberInputed2 = reader.nextInt();
        reader.close();
        rangeMultiplier(numberInputed2);
    }

    private static void rangeMultiplier(int a) {
        for (int i=1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a*i );
        }
    }
}