package com.jetbrians;
import java.util.Scanner;

public class returning {
    public returning(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book you want to return back:\n");
        String return1 = scanner.nextLine();
        System.out.println("\nYou returned " + return1);
        System.out.println("Thanks for taking care of this book very well!");
    }
}