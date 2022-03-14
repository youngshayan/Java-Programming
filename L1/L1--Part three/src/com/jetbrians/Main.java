/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/13
 *
 * program to calculate
 */
package com.jetbrians;
import java.util.*;
public class Main {
    public static class Solving {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Solving s=new Solving();
        System.out.println("");
        System.out.println("Enter the value of a:");
        s.a=input.nextInt();
        System.out.println("Enter the value of b:");
        s.b=input.nextInt();
        System.out.println("Enter the value of e:");
        s.e=input.nextInt();
        System.out.println("Enter the value of f:");
        s.f=input.nextInt();
        System.out.println("Enter the value of d:");
        s.d=input.nextInt();
        System.out.println("Enter the value of c:");
        s.c=input.nextInt();
        int x=((s.e*s.d)-(s.b*s.f))/((s.a*s.d)-(s.b*s.c));
        int y=((s.a*s.f)-(s.e*s.c))/((s.a*s.d)-(s.b*s.c));
        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);
        if(x<0 && y<0) {
            System.out.println("Error!!!!!!!");
        }
    }
}