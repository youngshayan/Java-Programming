/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/31
 *
 * program to
 */
package com.jetbrians;

public class Main {

    public static void main(String[] args) {
        worker worker = new worker();
        worker.n = 0;
        System.out.println("n = " + worker.n);
        worker.isEven();
        worker.isOdd();
        worker.isPositive();
        worker.isNegative();
        worker.isZero();
        worker.n = 1;
        System.out.println("n = " + worker.n);
        worker.isEven();
        worker.isOdd();
        worker.isPositive();
        worker.isNegative();
        worker.isZero();
        worker.n = -2;
        System.out.println("n = " + worker.n);
        worker.isEven();
        worker.isOdd();
        worker.isPositive();
        worker.isNegative();
        worker.isZero();
    }
}