/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/10
 *
 * program to calculate scores
 */
package com.jetbrians;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Studing student=new Studing();
        System.out.println("Enter the Programming score:");
        student.ProgrammingMark=input.nextInt();
        System.out.println("Enter the Math score:");
        student.MathMark=input.nextInt();
        System.out.println("Enter the English score:");
        student.EnglishMark=input.nextInt();
        System.out.println("Enter the Science score:");
        student.ScienceMark=input.nextInt();
        int sum=(student.EnglishMark*student.ED)+(student.ProgrammingMark*student.PD)+(student.ScienceMark*student.RD)+(student.MathMark*student.MD);
        int avg=sum/8;
        System.out.println("The average of your scores is: "+avg);
        if(avg<10){
            System.out.println("You Failed!");
        }
        else{
            System.out.println("Congrats You passed!");
        }
    }
}