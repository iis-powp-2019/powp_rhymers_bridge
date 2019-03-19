package edu.kis.vh.nursery;

/**
 * @author Jan
 * 
 */
public class DefaultCountingOutRhymer {

	private static final int BUFFER_SIZE = 12;
	private static final int FULL_COUNT = 11;
	private static final int TOTAL_START = -1;

	private int[] numbers = new int[BUFFER_SIZE];

	private int total = TOTAL_START;

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
		return total == TOTAL_START;
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
			return TOTAL_START;
		return numbers[total];
	}

	/**
	 * @return number removed from top of the stack
	 */
	public int countOut() {
		if (callCheck())
			return TOTAL_START;
		return numbers[total--];
	}

}
