package com.liumapp.blog.thread.concurrent.unsafe.demo1;

/**
 * @author liumapp
 * @file HasSelfPrivateNum.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class HasSelfPrivateNum {

    private int num = 0 ;

    public void add (String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println(" a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
