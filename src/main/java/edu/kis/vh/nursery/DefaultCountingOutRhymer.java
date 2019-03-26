package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int DEFAULT_RETURN_VALUE = -1;
	private static final int STACK_SIZE = 12;

	private int[] NUMBERS = new int[STACK_SIZE];
	private int total = DEFAULT_RETURN_VALUE;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	boolean callCheck() {
		return total == DEFAULT_RETURN_VALUE;
	}

	boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total];
	}

	int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total--];
	}

}
