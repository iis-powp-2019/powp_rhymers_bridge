package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import static edu.kis.vh.nursery.storage.IntStack.EMPTY_STACK_VALUE;

public class FIFORhymerTest {

    @Test public void countOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testVal = 1;
        rhymer.countIn(testVal);

        result = rhymer.countOut();
        Assert.assertEquals(testVal , result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

    }
}
