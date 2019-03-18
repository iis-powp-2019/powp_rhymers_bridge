package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
	DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	FirstInFirstOutRhymer FIFORhymer = new FirstInFirstOutRhymer();
	final int EMPTY_STACK_VALUE = -1;
	final int STACK_CAPACITY = 12;

	@Test
	public void testCountIn() {
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
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
		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4, testValue2 = 3;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);

		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		result = FIFORhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		FIFORhymer.countIn(testValue);
		result = FIFORhymer.countOut();
		Assert.assertEquals(4,result);


		FIFORhymer.countIn(testValue2);
		result = FIFORhymer.countOut();
		Assert.assertEquals(3,result);
	}

}
