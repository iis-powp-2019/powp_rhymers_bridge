package edu.kis.vh.nursery.stacks;

import org.junit.Assert;
import org.junit.Test;

public class IntArrayStackTest {
    @Test
    public void testPop() {
        IntArrayStack stack = new IntArrayStack();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        int result;

        result = stack.pop();
        Assert.assertEquals(EMPTY_STACK_HEAD_INDEX, result);
        for (int number : TEST_NUMBERS) {
            stack.push(number);
        }


        for (int i = TEST_NUMBERS.length - 1; i >= 0; i--) {
            result = stack.pop();
            Assert.assertEquals(result, TEST_NUMBERS[i]);
        }
    }

    @Test
    public void testTop(){
        IntArrayStack stack = new IntArrayStack();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        int result;

        for (int number : TEST_NUMBERS) {
            stack.push(number);
        }


        for (int i = TEST_NUMBERS.length - 1; i >= 0; i--) {
            result = stack.top();
            Assert.assertEquals(result, TEST_NUMBERS[i]);
            stack.pop();
        }
    }

    @Test
    public void testIsEmpty() {
        IntArrayStack stack = new IntArrayStack();
        final int VALUE = 0;

        boolean result = stack.isEmpty();
        Assert.assertTrue(result);

        stack.push(VALUE);
        result = stack.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        IntArrayStack stack = new IntArrayStack();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        for(int i=0;i<12;i++)
            stack.push(i);
        boolean result = stack.isFull();

        Assert.assertTrue(result);

    }

    @Test
    public void testGetHead(){
        IntArrayStack stack = new IntArrayStack();
        final int EMPTY_STACK_HEAD_INDEX = -1;
        final int TEST_NUMBERS[] = {1, 2, 3};
        final int HEAD_OF_LIST=2;
        int result;

        for (int number : TEST_NUMBERS) {
            stack.push(number);
        }
        result=stack.getHead();
        Assert.assertEquals(result,HEAD_OF_LIST);

    }
}
