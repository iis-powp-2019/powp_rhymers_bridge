package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	public static final int TEST_VALUE = 4;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int TESTVALUE = 4;
		rhymer.push(TESTVALUE);

		final int result = rhymer.top();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.isEmpty();
		Assert.assertEquals(true, result);

		rhymer.push(888);

		result = rhymer.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
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

		int result = rhymer.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		rhymer.push(TESTVALUE);

		result = rhymer.top();
		Assert.assertEquals(TESTVALUE, result);
		result = rhymer.top();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		rhymer.push(TESTVALUE);

		result = rhymer.pop();
		Assert.assertEquals(TESTVALUE, result);
		result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountInHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();
		final int TESTVALUE = 4;
		rhymer.push(TESTVALUE);

		final int result = rhymer.top();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCountOutFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		rhymer.push(TESTVALUE);

		result = rhymer.pop();
		Assert.assertEquals(TESTVALUE, result);
		result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testIsEmptyLinkedList()
	{
		IntLinkedList linkedList = new IntLinkedList();
		Assert.assertEquals(true, linkedList.isEmpty());
	}

	@Test
	public void testPushLinkedList()
	{
		IntLinkedList linkedList = new IntLinkedList();
		final int TESTVALUE = 5;
		linkedList.push(TESTVALUE);
		Assert.assertEquals(TESTVALUE, linkedList.top());
	}

	@Test
	public void testPopLinkedList()
	{
		IntLinkedList linkedList = new IntLinkedList();
		final int TESTVALUE = 7;
		final int TESTVALUE_NEXT = 4;
		linkedList.push(TESTVALUE);
		linkedList.push(TESTVALUE_NEXT);
		linkedList.pop();
		Assert.assertEquals(TESTVALUE, linkedList.top());
	}

	@Test
	public void testIsFullLinkedList()
	{
		IntLinkedList linkedList = new IntLinkedList();
		Assert.assertEquals(false, linkedList.isFull());
	}
}
