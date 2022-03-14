package com.jetbrians;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Surface rectangle=new Surface();
        Surface othershape=new Surface();
        int x,width,length;

        System.out.println("Enter the size of Rectangle width:");
        width=input.nextInt();
        System.out.println("Enter the size of Rectangle length:");
        length=input.nextInt();
        System.out.println("Enter one side of Square size:");
        x=input.nextInt();

        rectangle.S(width,length);
        othershape.Os(x);
        rectangle.calculating();
        othershape.calculatingn2();

    }
}
