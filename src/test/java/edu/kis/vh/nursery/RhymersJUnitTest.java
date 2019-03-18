package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
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


		HanoiRhymer hanoiRhymer = new HanoiRhymer();
		int secondTestValue = 5, thirdTestValue = 3;

		hanoiRhymer.countIn(testValue);
		hanoiRhymer.countIn(secondTestValue);

		result = hanoiRhymer.peekaboo();
		Assert.assertEquals(testValue, result);

		hanoiRhymer.countIn(thirdTestValue);

		result = hanoiRhymer.peekaboo();
		Assert.assertEquals(thirdTestValue, result);
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
		int testValue = 4, secondTestValue = 5;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);


		FirstInFirstOutRhymer FIFORhymer = new FirstInFirstOutRhymer();

		result = FIFORhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		FIFORhymer.countIn(testValue);
		FIFORhymer.countIn(secondTestValue);

		result = FIFORhymer.countOut();
		Assert.assertEquals(4,result);
		result = FIFORhymer.countOut();
		Assert.assertEquals(5,result);

	}

	@Test
	public void testIsEmpty() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_STACK_VALUE = -1;
		int testValue = 4;

		boolean result = intLinkedList.isEmpty();
		Assert.assertEquals(true,result);

		intLinkedList.push(testValue);

		result = intLinkedList.isEmpty();
		Assert.assertEquals(false,result);

		intLinkedList.pop();

		result = intLinkedList.isEmpty();
		Assert.assertEquals(true,result);
	}

	@Test
	public void testPop() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_STACK_VALUE = -1;
		int testValue = 4;

		int result = intLinkedList.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE,result);

		intLinkedList.push(testValue);

		result = intLinkedList.pop();
		Assert.assertEquals(testValue,result);

		result = intLinkedList.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE,result);
	}

	@Test
	public void testTop() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_STACK_VALUE = -1;
		int testValue = 4;

		int result = intLinkedList.top();
		Assert.assertEquals(EMPTY_STACK_VALUE,result);

		intLinkedList.push(testValue);

		result = intLinkedList.top();
		Assert.assertEquals(testValue,result);

		intLinkedList.pop();

		result = intLinkedList.top();
		Assert.assertEquals(EMPTY_STACK_VALUE,result);
	}

	@Test
	public void testPush() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4, secondTestValue = 5;
		intLinkedList.push(testValue);
		intLinkedList.push(secondTestValue);

		int result = intLinkedList.top();
		Assert.assertEquals(secondTestValue,result);
	}

}
