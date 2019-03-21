package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPop()
    {
        IntLinkedList linkedList = new IntLinkedList();
        final int TEST_VALUES[] = {1,2,3};
        int result;

        for(int value: TEST_VALUES) {
            linkedList.push(value);
        }


        for(int i = TEST_VALUES.length-1; i >= 0  ; i--)
        {
            result = linkedList.pop();
            Assert.assertEquals(result, TEST_VALUES[i]);
        }
    }

    @Test
    public void testIsEmpty()
    {
        IntLinkedList linkedList = new IntLinkedList();
        final int TEST_VALUE = 1;

        boolean result = linkedList.isEmpty();
        Assert.assertTrue(result);

        linkedList.push(TEST_VALUE);
        result = linkedList.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull()
    {
        IntLinkedList linkedList = new IntLinkedList();
        boolean result = linkedList.isFull();

        Assert.assertFalse(result);
    }
}
