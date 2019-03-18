package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {
    private FIFORhymer rhymer = new FIFORhymer();

    @Test
    public void countOut() {
        final int testValue = 4;
        rhymer.countIn(testValue);
        int result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
    }


}