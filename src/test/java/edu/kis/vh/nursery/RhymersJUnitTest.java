package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntCollection;
import edu.kis.vh.nursery.collection.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	// DefaultCountingOutRhymer tests

	@Test
	public void testD_C_O_R_CountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testD_C_O_R_CallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	/// Test nie ma już sensu, ponieważ nowa implementacja stosu ma teoretycznie nieograniczony rozmiar maksymalny
	/*
	@Test
	public void testD_C_O_R_IsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.push(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}
	*/


	@Test
	public void testD_C_O_R_IsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertFalse(result);
	}

	@Test
	public void testD_C_O_R_Peekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

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
	public void testD_C_O_R_CountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	// FIFORhymer test

	@Test
	public void testFIFORhymerCount() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = 0;
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

	// HanoiRhymer test

	@Test
	public void testHanoiRhymerCount() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int EMPTY_STACK_VALUE = 0;
		final int[][] testValues = {
				{13, 99, 99,  7, 99, 99, 99,  3, 99,  2},
				{14, 99, 99, 99, 99, 99,  7, 99,  5,  4},
				{ 7, 99, 99,  3, 99, 99,  2, 99,  1, 99}
		};
		final int[][] expectedResult = {
				{ 2,  3,  7, 13},
				{ 4,  5,  7, 14},
				{ 1,  2,  3,  7}
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

	// IntLinkedList tests

	@Test
	public void testI_L_L_push() {
		IntCollection list = new IntLinkedList();
		final int testValue = 5;
		list.push(testValue);

		int result = list.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testI_L_L_isEmpty() {
		IntCollection list = new IntLinkedList();
		boolean result = list.isEmpty();
		Assert.assertTrue(result);

		list.push(999);

		result = list.isEmpty();
		Assert.assertFalse(result);
	}

//	Method not implemented
//	@Test
//	public void testI_L_L_isFull() {}

	@Test
	public void testI_L_L_top() {
		IntCollection list = new IntLinkedList();
		final int EMPTY_LIST_VALUE = 0;

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
	public void testI_L_L_pop() {
		IntCollection list = new IntLinkedList();
		final int EMPTY_LIST_VALUE = 0;

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
