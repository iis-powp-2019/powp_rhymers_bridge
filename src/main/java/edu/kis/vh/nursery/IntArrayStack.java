package edu.kis.vh.nursery;

public class IntArrayStack {
	private static final int STACK_SIZE = 12;
	private static final int FULL_COUNT = 11;
	private static final int STACK_EMPTY = -1;

	private int[] numbers = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	/**
	 * @return total elements
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param in insert in on top of stack
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return true if empty
	 */
	public boolean callCheck() {
		return total == STACK_EMPTY;
	}

	/**
	 * @return true if full
	 */
	public boolean isFull() {
		return total == FULL_COUNT;
	}

	/**
	 * @return number from top of the stack
	 */
	public int peekAboo() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total];
	}

	/**
	 * @return number removed from top of the stack
	 */
	public int countOut() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total--];
	}
}
