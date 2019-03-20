package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test public void testCountIn() {
        final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int testValue = 4;
        rhymer.countIn(testValue);

        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int VALUE_TO_STACK = 888;
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(VALUE_TO_STACK);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        final int VALUE_TO_STACK = 888;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            final boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(VALUE_TO_STACK);
        }

        final boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
}
