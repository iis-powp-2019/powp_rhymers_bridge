package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 11;
	private static final int STACK_CAPACITY = 12;

	private int[] numbers = new int[STACK_CAPACITY];

	public int totalCount = EMPTY_STACK_VALUE;

	public void countIn(int newValue) {
		if (!isFull())
			numbers[++totalCount] = newValue;
	}

	public boolean isEmpty() {
		return totalCount == EMPTY_STACK_VALUE;
	}
		
	public boolean isFull() {
		return totalCount == FULL_STACK_VALUE;
	}
		
	protected int getPeekaboo() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount];
	}
			
	public int countOut() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[totalCount--];
	}
}
