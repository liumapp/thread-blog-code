package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file HelloTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
@RunWith(SpringRunner.class)
public class HelloTest {

    private Logger logger = LoggerFactory.getLogger(HelloTest.class);

    @Test
    public void testHello () {
        Hello hello = new Hello();
        hello.run();
        logger.info("job is done");
    }

}
