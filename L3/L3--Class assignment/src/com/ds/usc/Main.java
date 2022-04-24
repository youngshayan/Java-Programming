/**
 * Programmer: Shayan Mansornia
 * Date: 2022/04/22
 *
 * program to check user information
**/
package com.ds.usc;

public class Main {
    public static void main(String[] args) throws Exception {
        com.ds.usc.User[] users = new com.ds.usc.User[2];
        users [0] = new com.ds.usc.User();
        users [1] = new com.ds.usc.User();
        for (int i = 0 ; i < 2 ; i++){
            users[i].setuser();
            try {
                com.ds.usc.User.CheckUser(users);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}