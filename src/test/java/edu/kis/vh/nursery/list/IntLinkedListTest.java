package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class IntLinkedListTest {

    @Test public void getEMPTY() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertNotEquals(intLinkedList, Collections.EMPTY_LIST);

    }

    @Test public void push() {
        final int TEST_VALUE = 5;
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(TEST_VALUE);
        Assert.assertEquals(intLinkedList.getLast().getValue(), TEST_VALUE);

    }

    @Test public void isEmpty() {
        final int TEST_VALUE = 5;
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(TEST_VALUE);
        Assert.assertNotEquals(intLinkedList, Collections.EMPTY_LIST);
    }

    @Test public void top() {
        final int TOP_VALUE = 1;
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(4);
        intLinkedList.push(2);
        intLinkedList.push(1);
        Assert.assertEquals(intLinkedList.top(), TOP_VALUE);

    }

    @Test public void pop() {
        final int POP_VALUE = 1;
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.push(4);
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
