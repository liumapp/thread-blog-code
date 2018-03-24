package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file PrintTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
@RunWith(SpringRunner.class)
public class PrintTest {

    @Test
    public void testWrongPrint () {
        WrongPrint wrongPrint = new WrongPrint();
        Thread t1 = new Thread(wrongPrint);
        Thread t2 = new Thread(wrongPrint);
        Thread t3 = new Thread(wrongPrint);
        Thread t4 = new Thread(wrongPrint);
        Thread t5 = new Thread(wrongPrint);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    @Test
    public void testCorrectPrint () {
        CorrectPrint correctPrint = new CorrectPrint();
        Thread t1 = new Thread(correctPrint);
        Thread t2 = new Thread(correctPrint);
        Thread t3 = new Thread(correctPrint);
        Thread t4 = new Thread(correctPrint);
        Thread t5 = new Thread(correctPrint);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
