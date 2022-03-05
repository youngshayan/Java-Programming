/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/05
 *
 * program to  find given number in Array
 */
package com.jetbrians;

import java.util.Arrays;
import java.util.Scanner;

public class Numberfinder {

    public static void check(int[] arr, int toCheckValue) {

        boolean test = Arrays.asList(arr).contains(toCheckValue);

        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int array, toCheckValue;

        // Get the array
        System.out.println("Enter the array of numbers:");
        array= sc.nextInt();
        int []arr = new int[array];
        // Get the value to be checked
        System.out.println("Enter a number:");
        toCheckValue= sc.nextInt();

        check(arr, toCheckValue);
    }
}