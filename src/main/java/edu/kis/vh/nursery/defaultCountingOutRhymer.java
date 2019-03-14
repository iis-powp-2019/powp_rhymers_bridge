package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int MAX_CAPACITY = 12;
	public static final int STACK_EMPTY_VALUE = -1;
	private int[] NUMBERS = new int[MAX_CAPACITY];

	public int total = STACK_EMPTY_VALUE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == MAX_CAPACITY - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return NUMBERS[total--];
	}

}
