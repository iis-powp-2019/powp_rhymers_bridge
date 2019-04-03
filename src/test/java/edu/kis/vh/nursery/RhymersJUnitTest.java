package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntLinkedListAdapter;

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
	public void testCountInWithArray() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testCountInWithLinkedList() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
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
	public void testCallCheckWithArray() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testCallCheckWithLinkedList() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
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
		if(rhymer.stack instanceof IntArrayStack) Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsFullWithArray() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY-1; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		if(rhymer.stack instanceof IntArrayStack) Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsFullWithLinkedList() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		if(rhymer.stack instanceof IntArrayStack) Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

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
	public void testPeekabooWithArray() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		final int EMPTY_STACK_VALUE = 0;

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
	public void testPeekabooWithLinkedList() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
		final int EMPTY_STACK_VALUE = 0;

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
	
	@Test
	public void testCountOutWithArray() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
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
	
	@Test
	public void testCountOutWithLinkedList() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntLinkedListAdapter(new IntLinkedList()));
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
	
	@Test
	public void testFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();
		int startVal = 1;
		for(int i=startVal; i<5; i++) rhymer.countIn(i);
		
		Assert.assertEquals(startVal, rhymer.countOut());
	}
	
	@Test
	public void testHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();
		int rejected = 4;
		for(int i=0; i<5; i++) rhymer.countIn(i);
		
		Assert.assertEquals(rejected, rhymer.reportRejected());
	}

}
