package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
//all test are working properly
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        final int testValue = 4;
        rhymer.countIn(testValue);

        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        final int STACK_CAPACITY = 12;
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        final boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        final int EMPTY_STACK_VALUE = -1;
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        final int EMPTY_STACK_VALUE = -1;
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

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
