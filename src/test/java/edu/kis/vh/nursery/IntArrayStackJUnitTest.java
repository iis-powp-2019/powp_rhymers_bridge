package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayStackJUnitTest {

    @Test
    public void push() {
        final IntArrayStack stack = new IntArrayStack();
        final int testValue = 4;
        stack.push(testValue);
        final int result = stack.pop();
        Assert.assertEquals(testValue,result);
    }

    @Test
    public void isEmpty() {
        final IntArrayStack stack = new IntArrayStack();
        final int testValue = 4;
        final boolean testResult = true;
        stack.push(testValue);
        stack.pop();
        boolean result = stack.isEmpty();
        Assert.assertEquals(testResult, result);
    }

    @Test
    public void top() {
        final IntArrayStack stack = new IntArrayStack();
        final int testValue1 = 2;
        final int testValue2 = 4;
        stack.push(testValue1);
        stack.push(testValue2);
        stack.top();
        final int result = stack.top();
        Assert.assertEquals(testValue2,result);
    }

    @Test
    public void pop() {
        push();
    }
}