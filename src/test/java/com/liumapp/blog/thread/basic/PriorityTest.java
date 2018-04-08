package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file PriorityTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
@RunWith(SpringRunner.class)
public class PriorityTest {

    /**
     * the priority will be extended
     */
    @Test
    public void testPriority () {
        System.out.println("main thread begin , and his priority is : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end , and his priority is : " + Thread.currentThread().getPriority());
        Priority1 priority1 = new Priority1();
        priority1.start();
        System.out.println("now ,let us run again:");
        Thread.currentThread().setPriority(7);
        Priority1 priority11 = new Priority1();
        priority11.start();
    }

}
