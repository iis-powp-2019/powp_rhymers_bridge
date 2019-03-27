package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.IIntLinkedList;
import edu.kis.vh.nursery.datastructures.IntArrayStack;
import edu.kis.vh.nursery.datastructures.IntLinkedList;
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
	public void testIIntLinkedListIsFull() {
		IIntLinkedList rhymer = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.push(888);
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

	//testy dla IntLinkedList
	@Test
	public void IntLinkedListPushAndPop(){
		IntLinkedList intLinkedList = new IntLinkedList();

		int value = 1;
		intLinkedList.push(value);

		Assert.assertEquals(value, intLinkedList.pop());
	}

	@Test
	public void IntLinkedListIsEmpty(){
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertEquals(true, intLinkedList.isEmpty());

		int value = 1;
		intLinkedList.push(value);

		Assert.assertEquals(false, intLinkedList.isEmpty());
	}

	@Test
	public void IntLinkedListIsFull(){
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertEquals(false, intLinkedList.isFull());
	}

	@Test
	public void IntLinkedListPopWhenEmpty(){
		IntLinkedList intLinkedList = new IntLinkedList();

		Assert.assertEquals(-1, intLinkedList.pop());
	}



}
