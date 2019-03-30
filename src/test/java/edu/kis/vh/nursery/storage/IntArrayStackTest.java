package edu.kis.vh.nursery.storage;

import org.junit.Assert;
import org.junit.Test;

public class IntArrayStackTest {

    @Test public void isEmptyShouldReturnTrue(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean expectedValue = true;

        Assert.assertEquals(expectedValue, intArrayStack.isEmpty());
    }

    @Test public void isEmptyShouldReturnFalse(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean expectedValue = false;
        intArrayStack.push(1);

        Assert.assertEquals(expectedValue, intArrayStack.isEmpty());
    }

    @Test public void isFullShouldReturnTrue(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean expectedValue = true;
        for(int i = 0; i < IntArrayStack.getMaxSizeStack(); i++)
            intArrayStack.push(i);

        Assert.assertEquals(expectedValue, intArrayStack.isFull());
    }

    @Test public void isFullShouldReturnFalse(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean expectedValue = false;
        intArrayStack.push(1);

        Assert.assertEquals(expectedValue,intArrayStack.isFull());
    }

    @Test public void popIfStackIsEmpty(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final int expectedValue = StackableInterface.EMPTY_STACK_HEAD_INDEX;

        Assert.assertEquals(expectedValue,intArrayStack.pop());
    }

    @Test public void popIfStackIsNotEmpty(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final int expectedValue = 3;
        intArrayStack.push(3);

        Assert.assertEquals(expectedValue,intArrayStack.pop());
    }

    @Test public void topIfStackIsEmpty(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final int expectedValue = StackableInterface.EMPTY_STACK_HEAD_INDEX;

        Assert.assertEquals(expectedValue,intArrayStack.top());
    }

    @Test public void topIfStackIsNotEmpty(){
        IntArrayStack intArrayStack = new IntArrayStack();
        final int expectedValue = 3;
        intArrayStack.push(4);
        intArrayStack.push(3);

        Assert.assertEquals(expectedValue,intArrayStack.top());
    }
}