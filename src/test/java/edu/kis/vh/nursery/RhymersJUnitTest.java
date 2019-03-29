package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.StackInterface;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testFIFORhymerCount() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = -1;
		final int[] testValues = {1, 2, 3};

		for (int tV : testValues)
			rhymer.countIn(tV);

		int result = rhymer.countOut();
		Assert.assertEquals(testValues[0], result);
		result = rhymer.countOut();
		Assert.assertEquals(testValues[1], result);
		result = rhymer.countOut();
		Assert.assertEquals(testValues[2], result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testHanoiRhymerCount() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int EMPTY_STACK_VALUE = -1;
		final int[][] testValues = {
				{14, 99, 99,  8, 99, 99, 99,  4, 99,  3},
				{15, 99, 99, 99, 99, 99,  8, 99,  6,  5},
				{ 8, 99, 99,  4, 99, 99,  3, 99,  2, 99}
		};
		final int[][] expectedResult = {
				{ 3,  4,  8, 14},
				{ 5,  6,  8, 15},
				{ 2,  3,  4,  8}
		};
		int result;

		for (int tV : testValues[0]) {
			rhymer.countIn(tV);
		}
		for (int eR : expectedResult[0]) {
			result = rhymer.countOut();
			Assert.assertEquals(eR, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		for (int tV : testValues[1]) {
			rhymer.countIn(tV);
		}
		for (int eR : expectedResult[1]) {
			result = rhymer.countOut();
			Assert.assertEquals(eR, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		for (int tV : testValues[2]) {
			rhymer.countIn(tV);
		}
		for (int eR : expectedResult[2]) {
			result = rhymer.countOut();
			Assert.assertEquals(eR, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testIntLinkedListpush() {
		StackInterface list = new IntLinkedList();
		final int testValue = 5;
		list.push(testValue);

		int result = list.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testIntLinkedListisEmpty() {
		StackInterface list = new IntLinkedList();
		boolean result = list.isEmpty();
		Assert.assertEquals(true, result);

		list.push(999);

		result = list.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIntLinkedListtop() {
		StackInterface list = new IntLinkedList();
		final int EMPTY_LIST_VALUE = -1;

		int result = list.top();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);

		final int testValue = 5;
		list.push(testValue);

		result = list.top();
		Assert.assertEquals(testValue, result);
		result = list.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIntLinkedListpop() {
		StackInterface list = new IntLinkedList();
		final int EMPTY_LIST_VALUE = -1;

		int result = list.pop();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);

		final int testValue = 5;
		list.push(testValue);

		result = list.pop();
		Assert.assertEquals(testValue, result);
		result = list.pop();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);
	}
}
