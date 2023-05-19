package com.example.calculatorapi;

public class method {
    public static double add(double a, double b)
    {
        return a+b;
    }

    public static double subtraction (double a, double b){
        return a - b;
    }

    public static String division (double a, double b){
        if (b==0){
            throw new ZeroDiv();
        }
        else{
            double d=a/b;
            return Double.toString(d);
        }
    }

    public static double multiplication (double a, double b){
        return a * b;
    }
}
