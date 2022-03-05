package com.jetbrians;

/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/05
 *
 * program to print stars in
 */
public class Main {

    public static void main(String[] args) {
        int x, y;
        for (x = 1; x <= 4; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
