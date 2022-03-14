/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/14
 *
 * program to calculate the rectangle area
 */
package com.jetbrians;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Rectangle R=new Rectangle();
        System.out.println("Enter the width:");
        R.width= (int) input.nextFloat();
        System.out.println("Enter the length:");
        R.length= (int) input.nextFloat();
        if(R.width<0||R.width>20 && R.length<0||R.width>20){
            System.out.println("Program cannot start");
        }
        else{
            R.Area();
            System.out.println("Area is : "+R.Area());
            R.Permitted();
            System.out.println("Permitted is : "+R.Permitted());
        }

    }
}