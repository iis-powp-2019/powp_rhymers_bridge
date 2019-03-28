package edu.kis.vh.nursery.stacks;


import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testPop() {
        IntLinkedList linkedList = new IntLinkedList();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        int result;

        result = linkedList.pop();
        Assert.assertEquals(EMPTY_STACK_HEAD_INDEX, result);
        for (int number : TEST_NUMBERS) {
            linkedList.push(number);
        }


        for (int i = TEST_NUMBERS.length - 1; i >= 0; i--) {
            result = linkedList.pop();
            Assert.assertEquals(result, TEST_NUMBERS[i]);
        }
    }

    @Test
    public void testTop(){
        IntLinkedList linkedList = new IntLinkedList();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        int result;

        for (int number : TEST_NUMBERS) {
            linkedList.push(number);
        }


        for (int i = TEST_NUMBERS.length - 1; i >= 0; i--) {
            result = linkedList.top();
            Assert.assertEquals(result, TEST_NUMBERS[i]);
            linkedList.pop();
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

    @Test
    public void testGetHead(){
        IntLinkedList linkedList = new IntLinkedList();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        final int HEAD_OF_LIST=2;
        int result;

        for (int number : TEST_NUMBERS) {
            linkedList.push(number);
        }
        result=linkedList.getHead();
        Assert.assertEquals(result,HEAD_OF_LIST);

    }
}
