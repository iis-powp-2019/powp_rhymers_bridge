package edu.kis.vh.nursery.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntLinkedListTest {

IntLinkedList list = new IntLinkedList();
    @Test
    public void push() {
       list.push(25);
        assertFalse(list.isEmpty());
    }

    @Test
    public void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void isFull() {
        assertFalse(list.isFull());
    }

    @Test
    public void top() {
        assertEquals(list.top(),-1);
        final int[] array = {1,2,3,4};
        for (int element: array) {
            list.push(element);
        }
        assertEquals(list.top(),array[array.length-1]);
    }

    @Test
    public void pop() {
        final int[] array = {1,2,3,4};
        for (int element: array) {
            list.push(element);
        }
        assertFalse(list.isFull());
        assertEquals(list.pop(),array[array.length-1]);
    }
}