package com.liumapp.blog.thread.concurrent;

import com.liumapp.blog.thread.concurrent.unsafe.demo1.HasSelfPrivateNum;
import com.liumapp.blog.thread.concurrent.unsafe.demo1.ThreadA;
import com.liumapp.blog.thread.concurrent.unsafe.demo1.ThreadB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file DemoTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
@RunWith(SpringRunner.class)
public class DemoTest {

    @Test
    public void testDemo1 () {

        try {
            HasSelfPrivateNum numRef = new HasSelfPrivateNum();
            ThreadA threadA = new ThreadA(numRef);
            threadA.start();
            ThreadB threadB = new ThreadB(numRef);
            threadB.start();
            threadB.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
