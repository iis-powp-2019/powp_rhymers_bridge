package edu.kis.vh.nursery;

import org.junit.Test;
import org.junit.Assert;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class IntLinkedListTest {

	@Test
	public void testPush() {
		IntLinkedList stack = new IntLinkedList();
		int testValue = 4;
		stack.push(testValue);

		int result = stack.top();
		Assert.assertEquals(testValue, result);
    }
	
	@Test
	public void testisEmpty() {
		IntLinkedList stack = new IntLinkedList();
		boolean result = stack.isEmpty();
		Assert.assertEquals(true, result);

		stack.push(888);

		result = stack.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIsFull() {
		IntLinkedList stack = new IntLinkedList();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stack.isFull();
			Assert.assertEquals(false, result);
			stack.push(888);
		}

		boolean result = stack.isFull();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testTop() {
		IntLinkedList stack = new IntLinkedList();
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
		IntLinkedList stack = new IntLinkedList();
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