package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountInList() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        final int testValue = 4;
        rhymer.countIn(testValue);

        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountInArray() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheckList() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testCallCheckArray() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFullList() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }

        final boolean result = rhymer.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFullArray() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testPeekabooList() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

        final int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testPeekabooArray() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCountOutList() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedList());
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

    @Test
    public void testCountOutArray() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
        final int EMPTY_STACK_VALUE = 0;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

    @Test
    public void testCountOutFIFORhymer() {
        FIFORhymer rhymer = new FIFORhymer(new IntArrayStack());
        final int EMPTY_STACK_VALUE = 0;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
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
        Assert.assertTrue(intLinkedList.isEmpty());
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
        Assert.assertFalse(intLinkedList.isFull());
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
        Assert.assertFalse(intLinkedList.isFull());
    }
}
