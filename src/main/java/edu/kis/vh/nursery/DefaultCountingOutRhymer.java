package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_VALUE = -1;

	private static final int STACK_MAX_SIZE = 12;

	private int[] numbers = new int[STACK_MAX_SIZE];

	public int total = STACK_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_VALUE;
	}

	public boolean isFull() {
		return total == STACK_MAX_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total--];
	}

}
