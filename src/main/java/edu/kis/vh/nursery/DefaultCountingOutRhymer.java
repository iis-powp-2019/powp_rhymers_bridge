package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY = -1;
	private static final int NUMBERS_SIZE = 12;
	private static final int FULL = 11;
	private int[] numbers = new int[NUMBERS_SIZE];

	private int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	boolean callCheck() {
		return total == EMPTY;
	}

    boolean isFull() {
		return total == FULL;
	}

	int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
