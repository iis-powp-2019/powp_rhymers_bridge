package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
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

		//------------------------------------------------------

		HanoiRhymer hanoiRhymer = new HanoiRhymer();

		for(int i=5;i>=0;i--)
		{
			hanoiRhymer.countIn(i);
			result = hanoiRhymer.peekaboo();
			Assert.assertEquals(i,result);
		}

		int rejected = 0;
		for(int i=1;i<5;i++)
		{
			hanoiRhymer.countIn(i);
			rejected = hanoiRhymer.reportRejected();
			result = hanoiRhymer.peekaboo();
			Assert.assertEquals(0,result);
			Assert.assertEquals(i,rejected);
		}

		hanoiRhymer.countIn(-1);
		result = hanoiRhymer.peekaboo();
		Assert.assertEquals(-1,result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);

		//------------------------------------------

		IntLinkedList list = new IntLinkedList();
		boolean full = list.isFull();
		Assert.assertFalse(full);
		list.push(5);
		full = list.isFull();
		Assert.assertFalse(full);
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

		//----------------------------------------------------

		FIFORhymer fifoRhymer = new FIFORhymer();

		for(int i=5;i>=0;i--)
		{
			fifoRhymer.countIn(i);
		}
		for(int i=5;i>0;i--)
		{
			result = fifoRhymer.countOut();
			Assert.assertEquals(i,result);
		}

		fifoRhymer.countIn(10);
		result = fifoRhymer.countOut();
		Assert.assertEquals(0,result);
		result = fifoRhymer.countOut();
		Assert.assertEquals(10,result);
	}

	@Test
	public void testPush() {
		IntLinkedList list = new IntLinkedList();
		int testValue = 4;
		list.push(testValue);

		int result = list.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IntLinkedList list = new IntLinkedList();
		final int EMPTY_VALUE = -1;
		Assert.assertEquals(EMPTY_VALUE,list.pop());
		int testValue = 4;
		list.push(testValue);
		int result = list.pop();
		Assert.assertEquals(testValue, result);
		list.push(testValue-1);
		list.push(testValue+1);
		result = list.pop();
		Assert.assertEquals(testValue+1,result);
	}

	@Test
	public void testTop() {
		IntLinkedList list = new IntLinkedList();
		final int EMPTY_VALUE = -1;
		Assert.assertEquals(EMPTY_VALUE,list.top());
		int testValue = 4;
		list.push(testValue);
		int result = list.top();
		Assert.assertEquals(testValue, result);
		list.pop();
		result = list.top();
		Assert.assertEquals(EMPTY_VALUE,result);
	}

	@Test
	public void testIsEmpty() {
		IntLinkedList list = new IntLinkedList();
		boolean result = list.isEmpty();
		Assert.assertTrue(result);
		int testValue = 4;
		list.push(testValue);
		result = list.isEmpty();
		Assert.assertFalse(result);
		list.pop();
		result = list.isEmpty();
		Assert.assertTrue(result);
	}


}
