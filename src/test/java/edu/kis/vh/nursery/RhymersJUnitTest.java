package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekAboo();
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
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekAboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekAboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekAboo();
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
	}
	
	@Test
	public void testListIsEmpty() {
		boolean result;
		
		IntLinkedList list = new IntLinkedList();
		
		result = list.isEmpty();
		Assert.assertEquals(true, result);
		
		list.push(42);
		
		result = list.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testListIsFull() {
		boolean result;
		
		IntLinkedList list = new IntLinkedList();
		
		result = list.isFull();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testListTop() {
		IntLinkedList list = new IntLinkedList();
		
		list.push(42);
		list.push(43);
		
		Assert.assertEquals(43, list.top());
	}
	
	@Test
	public void testListpop() {
		IntLinkedList list = new IntLinkedList();
		
		list.push(42);
		list.push(43);
		
		list.pop();
		
		Assert.assertEquals(42, list.top());
	}


}
