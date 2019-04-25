package edu.kis.vh.nursery.storage;

import org.junit.Assert;
import org.junit.Test;

import static edu.kis.vh.nursery.storage.IntStack.EMPTY_STACK_VALUE;

public class IntLinkedListTest {

    @Test
    public void pushOneElement() {
        final int TEST_VALUE = 1;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(TEST_VALUE);

        Assert.assertEquals(intLinkedList.getLast().getValue(), TEST_VALUE);
    }

    @Test
    public void pushTwoElements() {
        final int FIRST_TEST_VALUE = 1;
        final int SECOND_TEST_VALUE = 2;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(FIRST_TEST_VALUE);
        intLinkedList.push(SECOND_TEST_VALUE);

        Assert.assertEquals(intLinkedList.getLast().getValue(), SECOND_TEST_VALUE);
        Assert.assertEquals(intLinkedList.getLast().getPrev().getValue(), FIRST_TEST_VALUE);
        Assert.assertEquals(intLinkedList.getLast().getPrev().getNext().getValue(), SECOND_TEST_VALUE);
    }

    @Test
    public void isEmptyFalse() {
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(1);

        Assert.assertEquals(intLinkedList.isEmpty(), false);
    }


    @Test
    public void isEmptyTrue() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(intLinkedList.isEmpty(), true);
    }

    @Test
    public void isFull() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(intLinkedList.isFull(), false);
    }

    @Test
    public void topNotEmptyList() {
        final int LIST_VALUE = 5;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(LIST_VALUE);

        Assert.assertEquals(intLinkedList.top(), LIST_VALUE);
    }

    @Test
    public void topEmptyList() {

        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(intLinkedList.top(), EMPTY_STACK_VALUE);
    }

    @Test
    public void popEmptyList() {

        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(intLinkedList.pop(), EMPTY_STACK_VALUE);
    }

    @Test
    public void popNotEmptyList() {
        final int LIST_VALUE = 5;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(LIST_VALUE);

        Assert.assertEquals(intLinkedList.top(), LIST_VALUE);
    }

    @Test
    public void setLastAndGetLast() {
        final Node TEST_NODE = new Node(5);

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.setLast(TEST_NODE);

        Assert.assertEquals(intLinkedList.getLast(), TEST_NODE);
    }

}
