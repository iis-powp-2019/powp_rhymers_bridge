package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MAX_STACK_SIZE = 12;

	private static final int RETURN_DEFAULT = -1;
	
	private static final int INITIAL_STACK_INDEX = -1;

	private int[] numbers = new int[MAX_STACK_SIZE];

	private int total = INITIAL_STACK_INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INITIAL_STACK_INDEX;
	}

	public boolean isFull() {
		return total == MAX_STACK_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURN_DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return RETURN_DEFAULT;
		return numbers[total--];
	}

}
