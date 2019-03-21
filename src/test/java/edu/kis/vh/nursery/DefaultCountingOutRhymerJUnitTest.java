package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultCountingOutRhymerJUnitTest {

	private static final int TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;
	private DefaultCountingOutRhymer rhymer;

	@Before
	public void initialization(){
		rhymer = new DefaultCountingOutRhymer();
	}

	@Test
	public void testCountIn() {
		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheck() {
		boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
        Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
            Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();

        Assert.assertFalse(result);
	}

	@Test
	public void testPeekaboo() {
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
		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
