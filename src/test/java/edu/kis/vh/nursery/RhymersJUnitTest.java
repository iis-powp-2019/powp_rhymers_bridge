package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
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
		Assert.assertEquals(false, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

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
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	//------//
	@Test
    public void reportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        Assert.assertEquals(hanoiRhymer.totalRejected, 0);
    }

    @Test
    public void countIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        int firstValue = 5;
        int nextValue = 3;
        int wrongValue = 4;
        hanoiRhymer.countIn(firstValue);
        hanoiRhymer.countIn(nextValue);
        hanoiRhymer.countIn(wrongValue);
        int peekaboo = hanoiRhymer.peekaboo();
        Assert.assertEquals(peekaboo, nextValue);
    }
    
    @Test
    public void countOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        int expctedValue = 5;
        int unexpcetedValue = 3;
        fifoRhymer.countIn(expctedValue);
        fifoRhymer.countIn(unexpcetedValue);
        int countOut = fifoRhymer.countOut();
        Assert.assertNotEquals(unexpcetedValue, countOut);
        Assert.assertEquals(expctedValue, countOut);
    }
}