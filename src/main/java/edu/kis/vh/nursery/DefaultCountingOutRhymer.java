package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_EMPTY = -1;

	private static final int STACK_CAPACITY = 12;

	private int[] numbers = new int[STACK_CAPACITY];

	public int total = STACK_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	boolean callCheck() {
		return total == STACK_EMPTY;
	}

	boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}

	int peekaboo() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total--];
	}

}
