package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStackInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntArrayStackTest {

    private IntArrayStack arrayStack;
    private static final int TEST_VALUE = 4;
    private static final int EMPTY_VALUE = IntStackInterface.EMPTY;
    private static final int[] VALUES = new int[]{3, 2, 1};

    @Before
    public void initialize(){
        arrayStack = new IntArrayStack();
    }

    @Test
    public void isEmtyWithGivenValeTest(){
        arrayStack.push(TEST_VALUE);
        Assert.assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void isEmtyWithoutGivenValeTest(){
        Assert.assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void popWhenStackIsEmptyTest(){
        Assert.assertEquals(EMPTY_VALUE, arrayStack.pop());
    }

    @Test
    public void popWhenStackHasValueTest(){
        arrayStack.push(TEST_VALUE);

        Assert.assertEquals(TEST_VALUE, arrayStack.pop());
        Assert.assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void isFullWithFullStackTest(){
        for(int i = 0; i < IntArrayStack.getCAPACITY(); i ++){
            arrayStack.push(TEST_VALUE);
        }

        Assert.assertTrue(arrayStack.isFull());
        Assert.assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void isFullWithEmptyStackTest(){
        Assert.assertFalse(arrayStack.isFull());
        Assert.assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void topWithEmptyStackTest(){
        Assert.assertEquals(EMPTY_VALUE,arrayStack.top());
    }

    @Test
    public void topWithValueInStackTest(){
        arrayStack.push(TEST_VALUE);
        Assert.assertEquals(TEST_VALUE,arrayStack.top());
    }
}
