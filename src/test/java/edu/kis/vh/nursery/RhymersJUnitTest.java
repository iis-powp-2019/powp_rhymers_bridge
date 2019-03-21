package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
//all test are working properly
    @Test
    public void testCountIn() {
        IntArrayStack rhymer = new IntArrayStack();

        final int testValue = 4;
        rhymer.countIn(testValue);
        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        IntArrayStack rhymer = new IntArrayStack();

        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);
        rhymer.countIn(888);
        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        final int STACK_CAPACITY = 12;
        IntArrayStack rhymer = new IntArrayStack();

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
        IntArrayStack rhymer = new IntArrayStack();

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
        IntArrayStack rhymer = new IntArrayStack();

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
