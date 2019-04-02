package edu.kis.vh.nursery;

import org.junit.Test;
import org.junit.Assert;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class IntArrayStackTest {

	@Test
	public void testPush() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;
		stack.push(testValue);

		int result = stack.top();
		Assert.assertEquals(testValue, result);
    }
	
	@Test
	public void testisEmpty() {
		IntArrayStack stack = new IntArrayStack();
		boolean result = stack.isEmpty();
		Assert.assertEquals(true, result);

		stack.push(888);

		result = stack.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIsFull() {
		IntArrayStack stack = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stack.isFull();
			Assert.assertEquals(false, result);
			stack.push(888);
		}

		boolean result = stack.isFull();
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testTop() {
		IntArrayStack stack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stack.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stack.push(testValue);

		result = stack.top();
		Assert.assertEquals(testValue, result);
		result = stack.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IntArrayStack stack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stack.push(testValue);

		result = stack.pop();
		Assert.assertEquals(testValue, result);
		result = stack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}