package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntArrayStackTest {
    private IntArrayStack stack;

    @Before
    public void init(){
        stack = new IntArrayStack();
    }

    @After
    public void teardown(){
        stack = null;
    }

    @Test
    public void isEmptyWhenEmpty(){
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void isEmptyWhenNotEmpty(){
        stack.push(2);
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void isFullWhenNotFull(){
        stack.push(4);
        stack.push(7);
        Assert.assertEquals(false, stack.isFull());
    }

    @Test
    public void isFullWhenFull(){
        for(int val = 0; val<13; val++) stack.push(val);
        Assert.assertEquals(true, stack.isFull());
    }

    @Test
    public void topWhenEmpty(){
        Assert.assertEquals(0, stack.top());
    }

    @Test
    public void topWhenNotEmpty(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        Assert.assertEquals(7, stack.top());
        Assert.assertEquals(4, stack.getTotal());
    }

    @Test
    public void popWhenEmpty(){
        Assert.assertEquals(0, stack.pop());
    }

    @Test
    public void popWhenNotEmpty(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        Assert.assertEquals(7, stack.pop());
        Assert.assertEquals(3, stack.getTotal());
    }
}
