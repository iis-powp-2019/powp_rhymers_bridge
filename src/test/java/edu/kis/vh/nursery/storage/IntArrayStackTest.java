package edu.kis.vh.nursery.storage;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayStackTest {
    @Test
    public void testPush() {
        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = 7;
        intArrayStack.push(EXPECTED_VALUE);
        Assert.assertEquals(EXPECTED_VALUE, intArrayStack.pop());
    }

    @Test
    public void testIsEmpty() {
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = true;
        Assert.assertEquals(EXPECTED_VALUE, intArrayStack.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = false;
        Assert.assertEquals(EXPECTED_VALUE, intArrayStack.isFull());
    }

    @Test
    public void testTop() {
        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = 0;
        Assert.assertEquals(EXPECTED_VALUE, intArrayStack.top());
    }

    @Test
    public void testPop() {
        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = 7;
        intArrayStack.push(7);
        Assert.assertEquals(EXPECTED_VALUE, intArrayStack.pop());
    }
}