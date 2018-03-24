package com.liumapp.blog.thread.basic.login;

/**
 * @author liumapp
 * @file WrongBLogin.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class WrongBLogin extends Thread {

    @Override
    public void run() {
        WrongLoginServlet.doPost("b" , "bbb");
    }
}
