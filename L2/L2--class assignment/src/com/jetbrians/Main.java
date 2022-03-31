/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/20
 *
 * program to --
 */
package com.jetbrians;
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.job();
        student.salary();
        System.out.println("------------");
        Teacher teacher = new Teacher();
        teacher.job();
        teacher.salary();
        System.out.println("------------");
        Employee employee = new Employee();
        employee.job();
        employee.salary();
    }
}