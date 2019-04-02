package com.gw.exercises.task1;

public class multsAndDivids {

    public static void main(String[] args) {
        //        Напиши програму яка ділить два числа ( 36 на 13);
        System.out.println(divider(36, 13));

        //        Напиши програму яка виводить на екран результат наступної дії ( a + b * c), де а = -5; b = 8; c =6;
        int a = -5, b = 8 , c = 6;
        System.out.println(formula(a, b, c));

    }

    private static int formula(int a, int b, int c) {

        return a + b * c;
    }

    private static float  divider(float a, float b) {

        return a / b;

    }
}
