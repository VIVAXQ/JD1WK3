package com.kolesnikov.jd1.task1;

import static org.junit.Assert.assertEquals;

public class SumOfNumTest {

    @org.junit.Test
    public void sumFunc() throws Exception {

        assertEquals(7,new SumOfNum().sumFunc(223));
    }
}