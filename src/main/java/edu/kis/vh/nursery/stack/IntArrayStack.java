package edu.kis.vh.nursery.stack;

/**
 * Class implementing default stack functionality
 */
public class IntArrayStack implements Stackable {

	private static final int STACK_CAPACITY = 12;

	private final int[] numbers = new int[STACK_CAPACITY];

	/**
	 * Gets total amount of numbers placed on stack minus 1
	 * @return total amount of numbers placed on stack minus 1
	 */
	@Override
	public int getTotal() { return total; }

	private int total = EMPTY_STACK_VALUE;

	/**
	 * Places passed argument onto stack
	 * @param in argument passed onto stack
	 */
	@Override
	public void push(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Checks if stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/**
	 * Checks if stack is full
	 * @return true if stack is full, false otherwise
	 */
	@Override
	public boolean isFull() {
		return total == STACK_CAPACITY -1;
	}

	/**
	 * Peeks last value on stack
	 * @return -1 if stack is empty, last value placed on stack otherwise
	 */
	@Override
	 public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}

	/**
	 * Removes last value on stack
	 * @return -1 if stack is empty, last value placed on stack otherwise
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}

}
