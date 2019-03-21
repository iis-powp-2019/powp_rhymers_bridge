package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int TEST_VALUE = 888;

		boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.callCheck();
        Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		final int TEST_VALUE = 888;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
            Assert.assertFalse(result);
			rhymer.countIn(TEST_VALUE);
		}

		boolean result = rhymer.isFull();
        Assert.assertFalse(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;
        final int TEST_VALUE = 4;
		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);


		rhymer.countIn(TEST_VALUE);

		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;
        final int TEST_VALUE = 4;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
