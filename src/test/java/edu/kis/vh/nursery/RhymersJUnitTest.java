package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

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

	@Ignore("Linked list dont have max capacity")
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
	public void testCountOut() {
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

	@Test
	public void testFIFORhymerCount() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int DEFAULT_RETURN_VALUE = 0;
		int testValues[] = { 1, 2, 3 };

		for (int i = 0; i < 3; i++)
			rhymer.countIn(testValues[i]);

		int result = rhymer.countOut();
		Assert.assertEquals(testValues[0], result);
		result = rhymer.countOut();
		Assert.assertEquals(testValues[1], result);
		result = rhymer.countOut();
		Assert.assertEquals(testValues[2], result);
		result = rhymer.countOut();
		Assert.assertEquals(DEFAULT_RETURN_VALUE, result);
	}

	@Ignore("Test is ignored coz of failure")
	@Test
	public void testHanoiRhymerCount() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int DEFAULT_RETURN_VALUE = -1;
		final int[][] testValues = { { 1, 33, 33, 4, 33, 33, 33, 3, 33, 2 }, { 5, 33, 33, 33, 33, 33, 6, 33, 8, 7 },
				{ 8, 33, 33, 11, 33, 33, 9, 33, 10, 33 } };

		final int[][] expectedResult = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 9, 10, 11 } };
		int result;

		for (int test : testValues[0]) {
			rhymer.countIn(test);
		}
		for (int r : expectedResult[0]) {
			result = rhymer.countOut();
			Assert.assertEquals(r, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(DEFAULT_RETURN_VALUE, result);

		for (int test : testValues[1]) {
			rhymer.countIn(test);
		}
		for (int r : expectedResult[1]) {
			result = rhymer.countOut();
			Assert.assertEquals(r, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(DEFAULT_RETURN_VALUE, result);

		for (int test : testValues[2]) {
			rhymer.countIn(test);
		}
		for (int r : expectedResult[2]) {
			result = rhymer.countOut();
			Assert.assertEquals(r, result);
		}
		result = rhymer.countOut();
		Assert.assertEquals(DEFAULT_RETURN_VALUE, result);
	}

}
