package edu.kis.vh.nursery;

import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.kis.vh.nursery.storage.IntArrayStack;

public class IntArrayStackTest {

	@Test
	public void isEmpty() {
		IntArrayStack intArrayStack = new IntArrayStack();
		Assert.assertTrue(intArrayStack.isEmpty());
		intArrayStack.push(1);
		Assert.assertFalse(intArrayStack.isEmpty());
	}

	@Test
	public void isNotEmpty() {
		IntArrayStack intArrayStack = new IntArrayStack();
		intArrayStack.push(1);
		Assert.assertFalse(intArrayStack.isEmpty());
	}

	@Test
	public void isFull() {
		IntArrayStack intArrayStack = new IntArrayStack();
		for (int i = 0; i < 12; i++)
			intArrayStack.push(i);
		Assert.assertTrue(intArrayStack.isFull());
		Assert.assertFalse(intArrayStack.isEmpty());
	}

	@Test
	public void isNotFull() {
		IntArrayStack intArrayStack = new IntArrayStack();
		intArrayStack.push(1);
		Assert.assertFalse(intArrayStack.isFull());
	}

	@Test
	public void popIfEmpty() {
		IntArrayStack intArrayStack = new IntArrayStack();
		Assert.assertEquals(-1, intArrayStack.pop());
	}
	
	@Test
	public void popIfNotEmpty() {
		IntArrayStack intArrayStack = new IntArrayStack();
		intArrayStack.push(1);
		Assert.assertEquals(1,intArrayStack.pop());
	}
	
	@Test
    public void topIfEmpty(){
		IntArrayStack intArrayStack = new IntArrayStack();
        Assert.assertEquals(-1, intArrayStack.top());
    }
	
	@Test
    public void topIfNotEmpty(){
		IntArrayStack intArrayStack = new IntArrayStack();
		intArrayStack.push(1);
		intArrayStack.push(2);
        Assert.assertEquals(2, intArrayStack.top());
    }
}
