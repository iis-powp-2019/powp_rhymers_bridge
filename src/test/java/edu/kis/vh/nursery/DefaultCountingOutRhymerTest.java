package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

    private DefaultCountingOutRhymer rhymer;
    private int testValue;
    private int EMPTY_STACK_VALUE;

    @Before
    public void initRhymer() {
        rhymer = new DefaultCountingOutRhymer();
        EMPTY_STACK_VALUE = rhymer.getIndexOutOfArray();
    }

    @Test
    public void testCountIn() {
        testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCallCheckIsTrueForEmpty() {
        Assert.assertEquals(true, rhymer.callCheck());

    }


    @Test
    public void testCallCheckIsFalseFor888() {
        rhymer.countIn(888);
        Assert.assertEquals(false, rhymer.callCheck());
    }

    @Test
    public void testRhymerIsFull() {
        Assert.assertEquals(false, rhymer.isFull());
    }

    @Test
    public void testPeekabooWithTestValue() {
        testValue = 4;
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.peekaboo());

    }

    @Test
    public void testPeekabooWhenStackIsEmpty() {
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());
    }

    @Test
    public void testCountOutWithTestValue() {
        testValue = 4;
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.countOut());

    }

    @Test
    public void testCountOutWhenStackIsEmpty() {
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }
}
