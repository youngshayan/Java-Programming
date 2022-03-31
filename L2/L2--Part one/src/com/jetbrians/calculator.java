package com.jetbrians;

public class calculator {
    public static int a;
    public static int b;
    public static void sum(){
        System.out.println("Summation--> "+(a+b));
    }
    public static void sub(){
        if(a>b){
            System.out.println("Subtraction--> "+(a-b));
        }
        else {
            System.out.println("Subtraction--> "+(b-a));
        }
    }
    public static void mul(){
        System.out.println("Multiplication--> "+(a*b));
    }
    public static void div(){
        if(b==0){
            System.out.println("Error try again!!!!");
            System.exit(0);
        }
        else {
            System.out.println("Division--> "+(a/b));
        }
    }
}