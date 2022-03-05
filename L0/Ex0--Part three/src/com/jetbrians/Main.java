/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/05
 *
 * program to * + - / two numbers
 */
package com.jetbrians;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the first number:");
        i= ss.nextInt();
        System.out.println("Enter the second number:");
        j= ss.nextInt();
        int c=i+j,d=j-i,e=i*j,f=i/j;

        System.out.println("Select the operation:");
        System.out.println("'1'=> +");
        System.out.println("'2'=> -");
        System.out.println("'3'=> x");
        System.out.println("'4'=> /");
        int op;
        op=ss.nextInt();
        System.out.println();
        switch(op) {
            case 1:
                System.out.println("The result is:"+c);
                break;

            case 2:
                System.out.println("The result is:"+d);
                break;
            case 3:
                System.out.println("The result is:"+e);
                break;
            case 4:
                System.out.println("The result is:"+f);
                break;
        }
    }
}
