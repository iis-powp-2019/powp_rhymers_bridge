package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.stack.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        int testValue = 4;
        rhymer.push(testValue);

        int result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.push(888);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.push(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.push(testValue);

        result = rhymer.top();
        Assert.assertEquals(testValue, result);
        result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.push(testValue);

        result = rhymer.pop();
        Assert.assertEquals(testValue, result);
        result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testRhymersFactory() {
        DefaultRhymersFactory rhymersFactory = new DefaultRhymersFactory();
        Assert.assertEquals(DefaultCountingOutRhymer.class, rhymersFactory.getStandardRhymer().getClass());
        Assert.assertEquals(DefaultCountingOutRhymer.class, rhymersFactory.getFalseRhymer().getClass());
        Assert.assertEquals(FIFORhymer.class, rhymersFactory.getFIFORhymer().getClass());
        Assert.assertEquals(HanoiRhymer.class, rhymersFactory.getHanoiRhymer().getClass());
    }
}
