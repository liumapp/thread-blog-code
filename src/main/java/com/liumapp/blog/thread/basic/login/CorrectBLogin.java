package com.liumapp.blog.thread.basic.login;

/**
 * @author liumapp
 * @file CorrectBLogin.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class CorrectBLogin extends Thread {

    @Override
    public void run() {
        CorrectLoginServlet.doPost("b" , "bbb");
    }

}
