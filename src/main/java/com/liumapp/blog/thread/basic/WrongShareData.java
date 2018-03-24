package com.liumapp.blog.thread.basic;

/**
 * 错误的共享数据方式
 * @author liumapp
 * @file WrongShareData.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class WrongShareData extends Thread {

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.getName() + "计算, 得出count = " + count);
    }
}
