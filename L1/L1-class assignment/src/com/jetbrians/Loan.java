package com.jetbrians;
import java.util.Scanner;

public class Loan {
    public Loan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of book, you want to loan:\n");
        String loan = scanner.nextLine();
        System.out.println("\nYou borrowed " +loan);
        System.out.println("\nTake care of the book!");
    }
}