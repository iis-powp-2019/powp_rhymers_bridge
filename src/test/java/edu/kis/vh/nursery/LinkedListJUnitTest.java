package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListJUnitTest {

    @Test
    public void testPop() {
        IntLinkedList linkedList = new IntLinkedList();
        final int TEST_NUMBERS[] = {1, 2, 3};
        int result;

        for (int number : TEST_NUMBERS) {
            linkedList.push(number);
        }


        for (int i = TEST_NUMBERS.length - 1; i >= 0; i--) {
            result = linkedList.pop();
            Assert.assertEquals(result, TEST_NUMBERS[i]);
        }
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList linkedList = new IntLinkedList();
        final int VALUE = 0;

        boolean result = linkedList.isEmpty();
        Assert.assertTrue(result);

        linkedList.push(VALUE);
        result = linkedList.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList linkedList = new IntLinkedList();
        boolean result = linkedList.isFull();

        Assert.assertFalse(result);
        
    }
}