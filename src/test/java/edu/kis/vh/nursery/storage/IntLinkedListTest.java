package edu.kis.vh.nursery.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {
    private IntLinkedList intLinkedList;
    private Node last;

    @Before
    public void initialize() {
        this.intLinkedList = new IntLinkedList();
    }

    @Test
    public void testPush() {
        intLinkedList.push(5);
        final int EXPECTED_VALUE = 5;
        Assert.assertEquals(EXPECTED_VALUE, intLinkedList.pop());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList tmp = new IntLinkedList();
        final boolean EXPECTED_VALUE = true;
        Assert.assertEquals(EXPECTED_VALUE, tmp.isEmpty());
    }

    @Test
    public void testIsFull() {
        final boolean EXPECTED_VALUE = false;
        Assert.assertEquals(EXPECTED_VALUE, intLinkedList.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList tmp = new IntLinkedList();
        final int EXPECTED_VALUE = 0;
        Assert.assertEquals(EXPECTED_VALUE, tmp.top());
    }

    @Test
    public void testPop() {
        IntLinkedList tmp = new IntLinkedList();
        final int EXPECTED_VALUE = 7;
        tmp.push(EXPECTED_VALUE);
        Assert.assertEquals(EXPECTED_VALUE, tmp.pop());
    }
}