package com.gw.exercises.task3;
import java.util.Scanner;

public class CircleVolume {
    public static void main (String[] args ) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter diameter of a circle: ");
        double diameter = inputReader.nextDouble();
        inputReader.close();
        getSqOfCircle (diameter);
    }

    private static void getSqOfCircle (double diameter) {
        double radius = diameter / 2;
        double sqPow = Math.pow(radius, 2);
        System.out.println(Math.PI * sqPow);
    }
}
