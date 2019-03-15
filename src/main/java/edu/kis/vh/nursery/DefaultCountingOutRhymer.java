package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;

	private int[] numbers = new int[STACK_CAPACITY];

	public int getTotal() {
		return total;
	}

	private int total = EMPTY_STACK_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == STACK_CAPACITY -1;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}

}
