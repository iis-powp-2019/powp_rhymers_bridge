package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	int DEFAULT_RETURN_VALUE = -1;
	int STACK_SIZE = 12;

	private int[] NUMBERS = new int[STACK_SIZE];
	public int total = DEFAULT_RETURN_VALUE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT_RETURN_VALUE;
	}

	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total--];
	}

}
