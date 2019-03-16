package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test public void push() {
        final int TEST_VALUE = 1;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(TEST_VALUE);

        Assert.assertEquals(intLinkedList.getLast().getValue(), TEST_VALUE);
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

    @Test public void top() {
        final int TOP_VALUE = 1;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(8);
        intLinkedList.push(6);
        intLinkedList.push(1);

        Assert.assertEquals(intLinkedList.top(), TOP_VALUE);

    }

    @Test public void pop() {
        final int POP_VALUE = 1;

        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(3);
        intLinkedList.push(2);
        intLinkedList.push(1);

        Assert.assertEquals(intLinkedList.pop(), POP_VALUE);
    }

    @Test public void getLast() {
        IntLinkedList intLinkedList = new IntLinkedList();
        final int FIRST_TEST_VALUE = 5;
        final int SECOND_TEST_VALUE = 5;

        Node node = new Node(FIRST_TEST_VALUE);
        Node node2 = new Node(SECOND_TEST_VALUE);

        intLinkedList.setLast(node);
        intLinkedList.setLast(node2);
        Assert.assertEquals(intLinkedList.getLast(), node2);

    }

}
