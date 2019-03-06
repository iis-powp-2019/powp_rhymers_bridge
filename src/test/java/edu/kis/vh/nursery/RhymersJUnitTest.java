package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	public static final int TEST_VALUE = 4;

	@Test
	public void testCountIn() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int TESTVALUE = 4;
		rhymer.countIn(TESTVALUE);

		final int result = rhymer.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCallCheck() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
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
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		rhymer.countIn(TESTVALUE);

		result = rhymer.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCountOut() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		rhymer.countIn(TESTVALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TESTVALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
