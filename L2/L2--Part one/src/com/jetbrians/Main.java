/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/22
 *
 * program to run simple calculator
 */
package com.jetbrians;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        calculator calc=new calculator();
        System.out.println("Enter first number:");
        String temp=input.next();
        int t=Integer.parseInt(temp);
        calc.a=t;
        System.out.println("Enter second number:");
        temp=input.next();
        t=Integer.parseInt(temp);
        calculator.b=t;
        calculator.sum();
        calculator.sub();
        calculator.mul();
        calculator.div();
    }
}