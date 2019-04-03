package com.gw.exercises.task1;

public class MultsAndDivids {
    public static void main (String[] args) {
        //        Write program that divides two numbers ( 36 on 13);
        System.out.println(divider(36, 13));
        //        Write program that displays to screen next result ( a + b * c), where а = -5; b = 8; c =6;
        int a = -5;
        int b = 8;
        int c = 6;
        System.out.println(formula(a, b, c));
    }
    private static int formula (int a, int b, int c) {
        return a + b * c;
    }
    private static float  divider (float a, float b) {
        return a / b;
    }
}
