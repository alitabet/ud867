package com.example.android.clickcounter;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by thabetak on 12/23/2015.
 */
public class ClickCounterTest {
    private ClickCounter mCounter;

    @Before
    public void setUpCounter() {
        mCounter = new ClickCounter();
    }

    @Test
    public void testInitialCount() {
        Assert.assertEquals(mCounter.getCount(), 0);
    }

    @Test
    public void testIncrement() throws Exception {
        int previousCount = mCounter.getCount();
        mCounter.increment();
        Assert.assertEquals(mCounter.getCount(), previousCount +  1);
    }
}