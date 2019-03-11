package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

    @Test public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        final int IN = 888;
        Assert.assertTrue(result);

        rhymer.countIn(IN);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            final int IN = 888;
            Assert.assertFalse(result);
            rhymer.countIn(IN);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int TEST_VALUE = 4;
        rhymer.countIn(TEST_VALUE);

        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
