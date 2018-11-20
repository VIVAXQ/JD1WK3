package com.kolesnikov.jd1.task3;

import org.junit.Test;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class WeathServiceTest {

    @Test
    public void doTask() throws Exception {

        int[] temp = {5,0,10};
        StatWeath stat1 = new StatWeath(3,15,5.0,10);
        StatWeath stat2 = new WeathService().doTask(3,temp);
        assertEquals(stat1.getQuanDays(),stat2.getQuanDays());
        assertEquals(stat1.getQuanAllPrec(),stat2.getQuanAllPrec());
        assertEquals(stat1.getAvgPrec(),stat2.getAvgPrec(),0.0);
        assertEquals(stat1.getMaxPrec(),stat2.getMaxPrec());
    }

}