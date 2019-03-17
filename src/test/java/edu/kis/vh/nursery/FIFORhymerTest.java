package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {
    FIFORhymer rhymer = new FIFORhymer();
    final int IS_EMPTY_INDICATOR = -1;

    @Test
    public void testCountOut() {
        int result = rhymer.countOut();
        Assert.assertEquals(IS_EMPTY_INDICATOR, result);

        final int firstTestValue = 5;
        rhymer.countIn(firstTestValue);

        final int secondTestValue = 10;
        rhymer.countIn(secondTestValue);

        result = rhymer.countOut();
        Assert.assertEquals(firstTestValue, result);

        rhymer.countOut();
        Assert.assertEquals(IS_EMPTY_INDICATOR, result);
    }
}