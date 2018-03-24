package com.liumapp.blog.thread.basic.login;

/**
 * @author liumapp
 * @file WrongLoginServlet.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class WrongLoginServlet {

    private static String usernameRef;

    private static String passwordRef;

    public static void doPost (String username , String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + " and password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
