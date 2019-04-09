package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.containers.IntLinkedList;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		IntLinkedList list = new IntLinkedList();
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer( list );
		int testValue = 4;
		
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		IntLinkedList list = new IntLinkedList();
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer( list );
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IntLinkedList list = new IntLinkedList();
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer( list );
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
		IntLinkedList list = new IntLinkedList();
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer( list );
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		// blad byl w metodzie countIn, ktora dodawala element do kolejnego Node'a
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		IntLinkedList list = new IntLinkedList();
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer( list );
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

}
