package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntegerLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
	static final int EMPTY_STACK_VALUE = 0;

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
		Assert.assertEquals(false, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

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
	public void testListTop() {
		IntegerLinkedList list = new IntegerLinkedList();

		int result = list.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int testValue = 4;
		list.push(testValue);

		result = list.top();
		Assert.assertEquals(testValue, result);
		result = list.pop();
		Assert.assertEquals(testValue, result);

		result = list.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testListIsEmpty() {
		IntegerLinkedList list = new IntegerLinkedList();

		Boolean result = list.isEmpty();
		Assert.assertEquals(true, result);

		for(int i = 0; i < 3; i++) {
			list.push(9);
			result = list.isEmpty();
			Assert.assertEquals(false, result);
		}

		for(int i = 0; i < 3; i++) {
			list.pop();
		}
		result = list.isEmpty();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testHanoiCountIn() {
		DefaultRhymersFactory rhymersFactory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer hanoiRhymer = rhymersFactory.getHanoiRhymer();

		int testValue = 4;
		hanoiRhymer.countIn(testValue);

		int result = hanoiRhymer.peekaboo();
		Assert.assertEquals(testValue, result);

		testValue = 10;
		hanoiRhymer.countIn(testValue);

		result = hanoiRhymer.peekaboo();
		Assert.assertNotEquals(testValue, result);
	}

	@Test
	public void testFIFOCountOut() {
		DefaultRhymersFactory rhymersFactory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer rhymerFIFO = rhymersFactory.getFIFORhymer();

		int result = rhymerFIFO.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymerFIFO.countIn(testValue);

		result = rhymerFIFO.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymerFIFO.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
    public void testHanoiReportRejected() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        int rejectedNumber = 1;

        int testValue = 4;
        hanoiRhymer.countIn(testValue);

        testValue = 5;
        hanoiRhymer.countIn(testValue);

        testValue = 3;
        hanoiRhymer.countIn(testValue);

        int result = hanoiRhymer.reportRejected();
        Assert.assertEquals(rejectedNumber, result);
    }

    @Test
    public void testStackTotal() {
        IntArrayStack intArrayStack = new IntArrayStack();
        int elementsAmount = 3;

        intArrayStack.push(6);
        intArrayStack.push(8);
        intArrayStack.push(9);

        Assert.assertEquals(elementsAmount, intArrayStack.getTotal());

        intArrayStack.pop();
        Assert.assertEquals(elementsAmount - 1, intArrayStack.getTotal());
    }

    @Test
    public void testListTotal() {
        IntegerLinkedList integerLinkedList = new IntegerLinkedList();
        int elementsAmount = 3;

        integerLinkedList.push(6);
        integerLinkedList.push(8);
        integerLinkedList.push(9);

        Assert.assertEquals(elementsAmount, integerLinkedList.getTotal());

        integerLinkedList.pop();
        Assert.assertEquals(elementsAmount - 1, integerLinkedList.getTotal());
    }

}
