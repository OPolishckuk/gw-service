package com.gw.exercises.task3;
import java.util.Scanner;

public class TriangleVolume {
    public static void main (String[] args) {
        Scanner inputHolder = new Scanner(System.in);
        System.out.println("Enter a Triangle 1st side length");
        double a = inputHolder.nextDouble();
        System.out.println("Enter a Triangle 2nd side length");
        double b = inputHolder.nextDouble();
        System.out.println("Enter a Triangle 3rd side length");
        double c = inputHolder.nextDouble();
        inputHolder.close();
        formulaOfGeron(a, b, c);
    }

    private static void formulaOfGeron (double a, double b, double c) {
        double halfPerimeter = (a+b+c) / 2;
        double triangleSquare = Math.sqrt(halfPerimeter *
                                         (halfPerimeter - a) *
                                         (halfPerimeter - b) *
                                         (halfPerimeter - c));
        System.out.println("The volume of triangle is: " + triangleSquare);
    }
}
