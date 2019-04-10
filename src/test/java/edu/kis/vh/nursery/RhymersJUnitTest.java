package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private static final int DEFAULT_TEST_VALUE = 4;
	private static final int DEFAULT_COUNT_IN_VALUE = 888;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = DEFAULT_TEST_VALUE;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(DEFAULT_COUNT_IN_VALUE);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = IStack.NUMBERS_QUANTITY;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(DEFAULT_COUNT_IN_VALUE);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = IStack.EMPTY_STACK_INDICATOR;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = DEFAULT_TEST_VALUE;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = IStack.EMPTY_STACK_INDICATOR;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = DEFAULT_TEST_VALUE;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
    public void testHanoiRhymerCountIn(){
	    HanoiRhymer rhymer = new HanoiRhymer();

	    int testValue = DEFAULT_TEST_VALUE;
	    rhymer.countIn(testValue);

	    int result = rhymer.peekaboo();
	    Assert.assertEquals(testValue,result);

	    testValue--;
	    rhymer.countIn(testValue);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue,result);

        rhymer.countIn(testValue+1);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue,result);

        result = rhymer.reportRejected();
        Assert.assertEquals(1,result);

    }

    @Test
    public void testFIFORhymerCountOut(){
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = IStack.EMPTY_STACK_INDICATOR;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue1 = DEFAULT_TEST_VALUE;
        int testValue2 = DEFAULT_TEST_VALUE+1;
        rhymer.countIn(testValue1);
        rhymer.countIn(testValue2);

        result = rhymer.countOut();
        Assert.assertEquals(testValue1, result);
        result = rhymer.countOut();
        Assert.assertEquals(testValue2, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

    }
}
