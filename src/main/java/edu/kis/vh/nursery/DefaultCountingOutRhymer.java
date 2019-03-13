package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_VALUE = -1;

	private static final int STACK_MAX_SIZE = 12;

	private int[] numbers = new int[STACK_MAX_SIZE];

	private int total = STACK_VALUE;

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == STACK_VALUE;
	}

	protected boolean isFull() {
		return total == STACK_MAX_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total--];
	}

}
