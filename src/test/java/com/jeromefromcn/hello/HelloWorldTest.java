package com.jeromefromcn.hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * HelloWorld Tester.
 *
 * @author jianglong3
 * @version 1.0
 * @since <pre>Mar 4, 2018</pre>
 */
public class HelloWorldTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    /**
     * Method: home()
     */
    @Test
    public void testHome() throws Exception {
        Assert.assertEquals("Hello World!", helloWorld.home());
    }


} 
