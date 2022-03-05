/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/05
 *
 * program to find the largest number in the Array
 */
package com.jetbrians;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Largest number in the array is:"+max);
    }
}