package edu.kis.vh.nursery;

import org.junit.Assert;

import org.junit.Test;

import edu.kis.vh.nursery.list.IntArrayStackInterface;
public class RhymersJUnitTest {

	private static final int testValue = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	
	@Test
	public void testCountIn() {
		IntArrayStack rhymer = new IntArrayStack();
		rhymer.countIn(testValue);

		int result = rhymer.peeKaBoo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		IntArrayStackInterface rhymer = new IntArrayStack();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IntArrayStackInterface rhymer = new IntArrayStack();
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
	public void testPeeKaBoo() {
		IntArrayStack rhymer = new IntArrayStack();
		
		int result = rhymer.peeKaBoo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(testValue);

		result = rhymer.peeKaBoo();
		Assert.assertEquals(testValue, result);
		
	}

	@Test
	public void testCountOut() {
		IntArrayStackInterface rhymer = new IntArrayStack();
		
		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
