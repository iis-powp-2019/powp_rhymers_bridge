package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntArrayStack;
import edu.kis.vh.nursery.stackImplementation.IntLinkedList;
import edu.kis.vh.nursery.stackImplementation.StackInterface;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertEquals(true, rhymer.callCheck());

        rhymer.countIn(888);

        Assert.assertEquals(false, rhymer.callCheck());
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY - 1; i++) {

            Assert.assertEquals(false, rhymer.isFull());
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(StackInterface.EMPTY, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        Assert.assertEquals(StackInterface.EMPTY, rhymer.countOut());

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());

        Assert.assertEquals(StackInterface.EMPTY, rhymer.countOut());
    }

    @Test
    public void testCountOutFIFORhymer() {
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY = 0;

        Assert.assertEquals(EMPTY, rhymer.countOut());

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(EMPTY, rhymer.countOut());
    }

    @Test
    public void testCountInHanoiRhymer() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testIsEmptyIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertEquals(true, intLinkedList.isEmpty());
    }

    @Test
    public void testPushIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 4;
        intLinkedList.push(testValue);
        Assert.assertEquals(testValue, intLinkedList.top());
    }

    @Test
    public void testIsFullIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertEquals(false, intLinkedList.isFull());
    }

    @Test
    public void testPopIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 4;
        int testValue2 = 5;
        intLinkedList.push(testValue);
        intLinkedList.push(testValue2);
        intLinkedList.pop();
        int result = intLinkedList.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsFullLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertEquals(false, intLinkedList.isFull());
    }
}
