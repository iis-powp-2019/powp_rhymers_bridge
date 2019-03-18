package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_EMPTY = -1;
	private static final int STACK_FULL = 11;
	private static final int STACK_CAPACITY = 12;
	private int[] NUMBERS = new int[STACK_CAPACITY];

	public int getTotal() {
		return total;
	}

	private int total = STACK_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_EMPTY;
		return NUMBERS[total];
	}

	protected int countOut() {
		if (callCheck())
			return STACK_EMPTY;
		return NUMBERS[total--];
	}

}
