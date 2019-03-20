package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int testValue = 4;
		rhymer.countIn(testValue);

		final int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertEquals(true, rhymer.callCheck());

		rhymer.countIn(888);

		Assert.assertEquals(false, rhymer.callCheck());
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertEquals(false, rhymer.isFull());
			rhymer.countIn(888);
		}
		Assert.assertEquals(true, rhymer.isFull());
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peekaboo());

	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.countOut());
		
		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

}
