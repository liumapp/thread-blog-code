package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file ShareDataTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
@RunWith(SpringRunner.class)
public class ShareDataTest {

    /**
     * 错误的共享数据的方式
     */
    @Test
    public void testWrongShare () {
        WrongShareData wrongShareData = new WrongShareData();

        Thread a = new Thread(wrongShareData , "A");
        Thread b = new Thread(wrongShareData , "B");
        Thread c = new Thread(wrongShareData , "C");
        Thread d = new Thread(wrongShareData , "D");
        Thread e = new Thread(wrongShareData , "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

    @Test
    public void testCorrectShare () {
        CorrectShareData correctShareData = new CorrectShareData();

        Thread a = new Thread(correctShareData , "A");
        Thread b = new Thread(correctShareData , "B");
        Thread c = new Thread(correctShareData , "C");
        Thread d = new Thread(correctShareData , "D");
        Thread e = new Thread(correctShareData , "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}
