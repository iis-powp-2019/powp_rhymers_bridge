package edu.kis.vh.nursery;

public class IntArrayStack {
	private static final int STACK_FULL_VALUE = 11;

	private static final int STACK_EMPTY_VALUE = -1;

	private static final int STACK_MAX_CAPACITY = 12;

	private final int[] numbers = new int[STACK_MAX_CAPACITY];

	private int total = STACK_EMPTY_VALUE;

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == STACK_FULL_VALUE;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return numbers[total--];
	}


}
