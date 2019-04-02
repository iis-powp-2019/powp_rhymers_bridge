package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void push() {
        final IntLinkedList list = new IntLinkedList();
        final int testValue = 4;
        list.push(testValue);
        final int result = list.pop();
        Assert.assertEquals(testValue,result);
    }

    @Test
    public void top() {
        final IntLinkedList list = new IntLinkedList();
        final int testValue1 = 6;
        final int testValue2 = 7;
        list.push(testValue1);
        list.push(testValue2);
        list.pop();
        final int result = list.top();
        Assert.assertEquals(testValue1,result);
    }

    @Test
    public void pop() {
        push();
    }
}