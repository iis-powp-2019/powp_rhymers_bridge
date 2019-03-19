package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testFactory() {
		DefaultRhymersFactory rhymersFactory = new DefaultRhymersFactory();
		Assert.assertEquals(DefaultCountingOutRhymer.class, rhymersFactory.getStandardRhymer().getClass());
		Assert.assertEquals(DefaultCountingOutRhymer.class, rhymersFactory.getFalseRhymer().getClass());
		Assert.assertEquals(FIFORhymer.class, rhymersFactory.getFIFORhymer().getClass());
		Assert.assertEquals(HanoiRhymer.class, rhymersFactory.getHanoiRhymer().getClass());
	}

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);

		HanoiRhymer hanoiRhymer = new HanoiRhymer();
		hanoiRhymer.countIn(5);
		hanoiRhymer.countIn(7);
		hanoiRhymer.countIn(9);
		hanoiRhymer.countIn(3);
		Assert.assertEquals(2, hanoiRhymer.reportRejected());
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

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
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		FIFORhymer fifoRhymer = new FIFORhymer();
		fifoRhymer.countIn(1);
		fifoRhymer.countIn(3);
		fifoRhymer.countIn(3);
		fifoRhymer.countIn(7);
		result = fifoRhymer.countOut();
		Assert.assertEquals(1, result);
		Assert.assertEquals(2, fifoRhymer.getTotal());
	}

}
