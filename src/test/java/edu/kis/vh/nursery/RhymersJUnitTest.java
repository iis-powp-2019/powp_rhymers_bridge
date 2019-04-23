package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackBulider.IntArrayStack;
import edu.kis.vh.nursery.stackBulider.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		IntArrayStack intArrayStack = new IntArrayStack();
		int testValue = 4;
		intArrayStack.countIn(testValue);

		int result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStack intArrayStack = new IntArrayStack();
		boolean result = intArrayStack.callCheck();
		Assert.assertEquals(true, result);

		intArrayStack.countIn(888);

		result = intArrayStack.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int STACK_CAPACITY = 11;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = intArrayStack.isFull();
			Assert.assertEquals(false, result);
			intArrayStack.countIn(888);
		}

		boolean result = intArrayStack.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = intArrayStack.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		intArrayStack.countIn(testValue);

		result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
		result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = intArrayStack.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		intArrayStack.countIn(testValue);

		result = intArrayStack.countOut();
		Assert.assertEquals(testValue, result);
		result = intArrayStack.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testPop() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_STACK_VALUE = 0;

		int result;

		int testValue = 4;
		intLinkedList.push(testValue);

		result = intLinkedList.pop();
		Assert.assertEquals(testValue, result);
		result = intLinkedList.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testPush() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);

		int result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}

}
