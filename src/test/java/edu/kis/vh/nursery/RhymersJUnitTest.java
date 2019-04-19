package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackInterface;

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
		Assert.assertEquals(true, result);
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
	}
	
	@Test
	public void testCountInHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testCountOutFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();
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
	public void testPushIntLinkedList() {
		StackInterface intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);
		int result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testIsEmptyIntLinkedList() {
		StackInterface intLinkedList = new IntLinkedList();
		boolean result = intLinkedList.isEmpty();
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsFullIntLinkedList() {
		StackInterface intLinkedList = new IntLinkedList();
		boolean result = intLinkedList.isFull();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testTopIntLinkedList() {
		StackInterface intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);
		int result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testPopIntLinkedList() {
		StackInterface intLinkedList = new IntLinkedList();
		int testValue = 4;
		int testValue2 = 5;
		intLinkedList.push(testValue);
		intLinkedList.push(testValue2);
		intLinkedList.pop();
		int result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}

}
