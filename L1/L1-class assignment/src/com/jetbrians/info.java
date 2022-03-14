package com.jetbrians;
import java.util.Scanner;

public class info {
    public int sNo;
    public String bookName;
    public String authorName;
    Scanner sc = new Scanner(System.in);
    public info() {
        System.out.println("Enter Serial No of the book:");
        this.sNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of the book:");
        this.bookName = sc.nextLine();
        System.out.println("Enter name of the Author:");
        this.authorName = sc.nextLine();
    }
}