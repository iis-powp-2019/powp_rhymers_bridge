package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
// TODO: check name.
	private static final int FULL_STACK_VALUE = 11;
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;
	private int[] numbers = new int[STACK_CAPACITY];
	private int total = EMPTY_STACK_VALUE;

	protected int getTotal() {
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == EMPTY_STACK_VALUE;
	}

	protected boolean isFull() {
		return total == FULL_STACK_VALUE;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}
}