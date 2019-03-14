package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {

    @Test public void countOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int DEFAUL_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(DEFAUL_STACK_VALUE, result);

        int testVal = 1;
        rhymer.countIn(testVal);

        result = rhymer.countOut();
        Assert.assertEquals(testVal , result);
        result = rhymer.countOut();
        Assert.assertEquals(DEFAUL_STACK_VALUE, result);

    }
}