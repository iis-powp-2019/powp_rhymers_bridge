package edu.kis.vh.nursery;

/**
 * Class implementing default stack functionality
 */
public class IntArrayStack {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;

	private final int[] numbers = new int[STACK_CAPACITY];

	/**
	 * Gets total amount of numbers placed on stack minus 1
	 * @return total amount of numbers placed on stack minus 1
	 */
	public int getTotal() {
		return total;
	}

	private int total = EMPTY_STACK_VALUE;

	/**
	 * Places passed argument onto stack
	 * @param in argument passed onto stack
	 */
	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Checks if stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	public boolean callCheck() {
		return total == EMPTY_STACK_VALUE;
	}

	/**
	 * Checks if stack is full
	 * @return true if stack is full, false otherwise
	 */
	public boolean isFull() {
		return total == STACK_CAPACITY -1;
	}

	/**
	 * Peeks last value on stack
	 * @return -1 if stack is empty, last value placed on stack otherwise
	 */
	protected int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}

	/**
	 * Removes last value on stack
	 * @return -1 if stack is empty, last value placed on stack otherwise
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}

}
