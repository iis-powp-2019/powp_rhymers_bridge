package edu.kis.vh.nursery;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultCountingOutRhymerTest {

    private DefaultCountingOutRhymer testObject = new DefaultCountingOutRhymer();
    @Test
    public void getCurrentSize() {
        assertEquals(testObject.getCurrentSize(),-1);
    }

    @Test
    public void countIn() {
        final int[] array = {1,2,3,4};
        for (int element: array) {
            testObject.countIn(element);
        }
        assertEquals(testObject.getCurrentSize(),3);
    }

    @Test
    public void callCheck() {
        testObject.countIn(5);
        assertFalse(testObject.callCheck());
    }

    @Test
    public void isFull() {
        assertFalse(testObject.isFull());
    }

    @Test
    public void peekaboo() {
        assertNotEquals(testObject.peekaboo(),3);
    }

    @Test
    public void countOut() {
        assertNotEquals(testObject.peekaboo(),2);
    }
}