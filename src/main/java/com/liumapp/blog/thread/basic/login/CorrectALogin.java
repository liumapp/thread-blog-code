package com.liumapp.blog.thread.basic.login;

/**
 * @author liumapp
 * @file CorrectALogin.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class CorrectALogin extends Thread {

    @Override
    public void run() {
        CorrectLoginServlet.doPost("a" , "aaa");
    }

}
