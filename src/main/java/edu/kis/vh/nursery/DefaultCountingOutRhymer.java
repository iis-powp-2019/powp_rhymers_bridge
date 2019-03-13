package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int BUFFER_SIZE = 12;
	private static final int FULL_COUNT = 11;
	private static final int TOTAL_START = -1;

	private int[] numbers = new int[BUFFER_SIZE];

	public int total = TOTAL_START;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_START;
	}

	public boolean isFull() {
		return total == FULL_COUNT;
	}

	protected int peekAboo() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total--];
	}

}
