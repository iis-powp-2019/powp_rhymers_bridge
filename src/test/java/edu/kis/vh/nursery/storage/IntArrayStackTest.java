package edu.kis.vh.nursery.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayStackTest {
    IntArrayStack intArrayStack;
    @Before public void setup(){
        intArrayStack = new IntArrayStack();
    }

    @Test
    public void isEmptyShouldReturnValue(){
        Assert.assertEquals(IntStorageInterface.STACKEMPTY,intArrayStack.isEmpty());
    }

    @Test
    public void isFullMethodShouldReturnFalseWhenStackIsntFull(){
        intArrayStack.countIn(1);
        intArrayStack.countIn(2);
        intArrayStack.countIn(3);
        intArrayStack.countIn(2);
        Assert.assertEquals(false,intArrayStack.isFull());
    }

    @Test
    public void isFullMethodShouldReturnTrueWhenStackIsFull(){
        intArrayStack.countIn(1);
        intArrayStack.countIn(2);
        intArrayStack.countIn(3);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        intArrayStack.countIn(2);
        Assert.assertEquals(true,intArrayStack.isFull());
    }
    @Test
    public void popMethodShouldReturnLastPushValue(){
        IntArrayStack intArrayStack = new IntArrayStack();
        intArrayStack.countIn(1);
        intArrayStack.countIn(2);
        intArrayStack.countIn(3);
        Assert.assertEquals(3,intArrayStack.peekaboo());
    }
}
