package com.gw.exercises.task3;
import java.util.Scanner;

public class ParallelepipedVolume {
    public static void main (String[] args) {
        Scanner inputHolder = new Scanner(System.in);
        System.out.println("Enter a Parallelepiped width");
        double a = inputHolder.nextDouble();
        System.out.println("Enter a Parallelepiped height");
        double b = inputHolder.nextDouble();
        System.out.println("Enter a Parallelepiped depth");
        double c = inputHolder.nextDouble();
        inputHolder.close();
        int result = (int) (2 * (a * b + b * c + a * c));
        System.out.println("Volume is: " + result);
    }
}