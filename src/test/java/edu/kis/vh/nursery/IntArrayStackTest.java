package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntStorageInterface;
import org.junit.Assert;
import org.junit.Test;

public class IntArrayStackTest {

    @Test
    public void isEmptyShouldReturnTrue(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = true;

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.isEmpty());

    }

    @Test
    public void isEmptyShouldReturnFalse(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = false;

        intArrayStack.push(1);

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.isEmpty());

    }

    @Test
    public void isFullShouldReturnTrue(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = true;

        for(int i=0; i<IntArrayStack.getCAPACITY(); i++){
            intArrayStack.push(i);
        }

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.isFull());

    }

    @Test
    public void isFullShouldReturnFalse(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final boolean EXPECTED_VALUE = false;

        intArrayStack.push(1);

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.isFull());

    }

    @Test
    public void popIfStackIsEmpty(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = IntStorageInterface.EMPTY_STACK_HEAD_INDEX;

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.pop());

    }

    @Test
    public void popIfStackIsNotEmpty(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = 3;

        intArrayStack.push(3);

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.pop());

    }

    @Test
    public void topIfStackIsEmpty(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = IntStorageInterface.EMPTY_STACK_HEAD_INDEX;

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.top());

    }

    @Test
    public void topIfStackIsNotEmpty(){

        IntArrayStack intArrayStack = new IntArrayStack();
        final int EXPECTED_VALUE = 3;

        intArrayStack.push(4);
        intArrayStack.push(3);

        Assert.assertEquals(EXPECTED_VALUE,intArrayStack.top());

    }


}
