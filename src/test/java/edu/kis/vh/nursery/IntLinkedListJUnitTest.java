package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    private IntLinkedList linkedList;
    private static final int TEST_VALUE = 4;
    private static final int EMPTY_VALUE = -1;
    private static final int[] VALUES = new int[]{3, 2, 1};

    @Before
    public void initialize(){
        linkedList = new IntLinkedList();
    }

    @Test
    public void isFullTest(){
        Assert.assertFalse(linkedList.isFull());
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(linkedList.isEmpty());

        linkedList.push(TEST_VALUE);

        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void popTest(){

        Assert.assertEquals(EMPTY_VALUE, linkedList.pop());

        for(int value : VALUES){
            linkedList.push(value);
        }

        for(int i = VALUES.length - 1; i>= 0; i--){
            Assert.assertEquals(linkedList.pop(), VALUES[i]);
        }

    }
}
