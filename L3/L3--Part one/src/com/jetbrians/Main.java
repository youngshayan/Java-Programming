/**
 * Programmer: Shayan Mansornia
 * Date: 2022/03/22
 *
 * program to
 */
package com.jetbrians;
import java.util.*;
public class Main {

    public static boolean main(String[] args) {
        Scanner input = new Scanner(System.in);
        info info = new info();


        System.out.println("enter your name");
        info.name = input.next();
        System.out.println("enter your username");
        info.username = input.next();
        System.out.println("enter your password");
        info.pass = input.nextInt();
        String re = info.username;
        String str = info.name;
        int r = info.pass;
        (String Object value;
        Object value1 = value;){
            try {
                int i = Integer.parseInt(String.valueOf(value1));
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        try {
            if (re.equalsIgnoreCase(str)) {
            }
        } catch (Exception d) {
            d.printStackTrace();
            System.out.println("that should be in the right place");
            System.out.println(d.getMessage());
            System.out.println(d.getClass());
        }
        try {
            if (str.equalsIgnoreCase(re)) {
            }
        } catch (Exception f) {

            f.printStackTrace();
            System.out.println("that should be in the right place");
            System.out.println(f.getMessage());
            System.out.println(f.getClass());
        }
        try {

            int i= Integer.parseInt(String.valueOf(r));

        } catch (NumberFormatException e) {
            System.out.println("Do it the right way");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }


    }
    public boolean
}
