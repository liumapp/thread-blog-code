package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file WrongShareDataTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
@RunWith(SpringRunner.class)
public class WrongShareDataTest {

    /**
     * 错误的共享数据的方式
     */
    @Test
    public void testShare () {
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

}
