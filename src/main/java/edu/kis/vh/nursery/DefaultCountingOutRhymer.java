package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 11;
	private static final int STACK_CAPACITY = 12;

	private int[] numbers = new int[STACK_CAPACITY];

	private int totalCount = EMPTY_STACK_VALUE;

	void countIn(int newValue) {
		if (!isFull())
			numbers[++totalCount] = newValue;
	}

	boolean isEmpty() {
		return totalCount == EMPTY_STACK_VALUE;
	}
		
	boolean isFull() {
		return totalCount == FULL_STACK_VALUE;
	}
		
	int getPeekaboo() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount];
	}
			
	int countOut() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount--];
	}
}
