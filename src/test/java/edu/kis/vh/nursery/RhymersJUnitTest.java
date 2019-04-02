package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.StackValues;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RhymersJUnitTest {

	private DefaultCountingOutRhymer rhymer;

	@Before
	public void setUp() {
		rhymer = new DefaultCountingOutRhymer();
	}

	@Test
	public void testCountIn() {
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.actualNumber();
		Assert.assertEquals(testValue, result);
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
	@Ignore
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		for (int i = 0; i < StackValues.STACK_CAPACITY.getValue(); i++) {
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

		int result = rhymer.actualNumber();
		Assert.assertEquals(StackValues.EMPTY_STACK_VALUE.getValue(), result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.actualNumber();
		Assert.assertEquals(testValue, result);
		result = rhymer.actualNumber();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {

		int result = rhymer.countOut();
		Assert.assertEquals(StackValues.EMPTY_STACK_VALUE.getValue(), result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(StackValues.EMPTY_STACK_VALUE.getValue(), result);
	}

}
