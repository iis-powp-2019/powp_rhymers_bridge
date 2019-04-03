package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int testValue = 4;
		rhymer.countIn(testValue);

		final int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
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

		final boolean result = rhymer.isFull();
        Assert.assertFalse(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

		final int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peekaboo());
		Assert.assertEquals(testValue, rhymer.peekaboo());
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

    @Test
    public void testCountOutFIFORhymer() {
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());
        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

    @Test
    public void testCountInHanoiRhymer() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testIsEmptyIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertTrue(intLinkedList.isEmpty());
    }

    @Test
    public void testPushIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 4;
        intLinkedList.push(testValue);
        Assert.assertEquals(testValue, intLinkedList.top());
    }

    @Test
    public void testIsFullIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertFalse(intLinkedList.isFull());
    }

    @Test
    public void testPopIntLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 4;
        int testValue2 = 5;
        intLinkedList.push(testValue);
        intLinkedList.push(testValue2);
        intLinkedList.pop();
        int result = intLinkedList.top();

        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsFullLinkedList() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertFalse(intLinkedList.isFull());
    }
}
