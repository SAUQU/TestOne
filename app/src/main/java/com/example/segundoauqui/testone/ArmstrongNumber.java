package com.example.segundoauqui.testone;

/**
 * Created by segundoauqui on 8/8/17.
 */

public class ArmstrongNumber {

    public static void main(String[] args) {

        int a = 0;
        int b;
        int temp;
        int n = 153;
        temp = n;

        while (n > 0) {
            b = n % 10;
            n = n / 10;
            a = b + (b * b * b);
        }
        if (temp == a)
            System.out.println("armstrong");
        else
            System.out.println("Not armstrong");
    }
}

