package edu.kis.vh.nursery;

public class IntArrayStack {
	
	private static final int STACK_VALUE = -1;

	private static final int STACK_MAX_SIZE = 12;

	private int[] numbers = new int[STACK_MAX_SIZE];

	private int total = STACK_VALUE;

	public int getTotal() {
		return total;
	}

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

	public int peekaboo() {
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
