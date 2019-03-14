package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int STACK_EMPTY = -1;
	public static final int STACK_FULL = 11;
	public static final int STACK_CAPACITY = 12;
	private int[] NUMBERS = new int[STACK_CAPACITY];

	public int total = STACK_EMPTY;

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

	public int countOut() {
		if (callCheck())
			return STACK_EMPTY;
		return NUMBERS[total--];
	}

}
