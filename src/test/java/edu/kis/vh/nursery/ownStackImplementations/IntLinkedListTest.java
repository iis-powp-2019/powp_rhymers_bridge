package edu.kis.vh.nursery.ownStackImplementations;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntLinkedListTest {

    @Test
    public void testPushAndPop() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int val = 10;
        intLinkedList.push(val);
        int result = intLinkedList.pop();
        assertThat(val, is(result));
    }

    @Test
    public void testPeek() {
        IntLinkedList intLinkedList = new IntLinkedList();
        for (int i = 0; i < 10; i++) {
            intLinkedList.push(i);
        }
        assertThat(9, is(intLinkedList.peek()));
    }

}