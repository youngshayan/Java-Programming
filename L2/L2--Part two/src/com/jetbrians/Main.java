/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/29
 *
 * program to choosing the study course
 */
package com.jetbrians;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Course course=new Course();
        course.name[0]="AP";
        course.unit[0]=3;
        course.pish[0]="barname nevisi pishrafte";
        course.ham[0]="Kargah";
        course.name[1]="Kargah";
        course.unit[1]=1;
        course.pish[1]="barname nevisi pishrafte";
        course.ham[1]="Ap";
        course.name[2]="Physics 2";
        course.unit[2]=3;
        course.pish[2]="Physics 1";
        course.name[3]="Math 2";
        course.unit[3]=3;
        course.pish[3]="math 1";
        course.name[4]="General English";
        course.unit[4]=2;
        course.pish[4]="Highschool English";
        course.name[5]="Revolution";
        course.unit[5]=2;
        System.out.println("Enter the course:");
        String temp=input.next();
        for(int i=0;i<6;i++){
            if(temp.equals(course.name[i])){
                System.out.println("Units: "+course.unit[i]+ "\n Pishniaz: "+course.pish[i]+"\n Hamniaz: "+course.ham[i]);
                break;
            }
        }

    }
}