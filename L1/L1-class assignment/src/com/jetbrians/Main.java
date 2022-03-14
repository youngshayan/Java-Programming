/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/14
 *
 * program to manage the library 
 */
package com.jetbrians;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int choice;
        while (running) {
            System.out.println("\n        **** library ****       ");
            System.out.println("Enter 1 to add book to the library");
            System.out.println("Enter 2 to loan a book");
            System.out.println("Enter 3 to return a book");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    info info = new info();
                    System.out.println(info.bookName);
                    System.out.println(info.authorName);
                    System.out.println(info.sNo);
                    System.out.println("Book added successfully!!! ");
                    break;
                case 2:
                    Loan loan = new Loan();
                    break;
                case 3:
                    returning return1 = new returning();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
