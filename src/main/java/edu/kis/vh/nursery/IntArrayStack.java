package edu.kis.vh.nursery;

public class IntArrayStack {
	
	/**
	 * Value to return when there is no numbers
	 */
	private static final int DEFAULT_RETURN_VALUE = -1;
	/**
	 * Maximum amount of numbers to store
	 */
	private static final int STACK_SIZE = 12;

	/**
	 * Numbers stored in rhymer
	 */
	private int[] NUMBERS = new int[STACK_SIZE];
	/**
	 * Amount of stored numbers
	 */
	private int total = DEFAULT_RETURN_VALUE;

	/**
	 * Getter to variable named "total"
	 * @return value of total variable
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Add number to the rhymer
	 * @param in - number to add
	 */
	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return true if there is no numbers in rhymer
	 */
	boolean callCheck() {
		return total == DEFAULT_RETURN_VALUE;
	}

	/**
	 * @return true if rhymer cant store more numbers
	 */
	boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 * @return last added number
	 */
	int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total];
	}

	/**
	 * Returns last added number, then removes it from rhymer
	 * @return 
	 */
	int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return NUMBERS[total--];
	}
}
