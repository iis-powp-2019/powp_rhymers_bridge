package edu.kis.vh.nursery;

public class DefaultCoutingOutRhymer {
	
	private static final int NOT_FOUND_RETURN = -1;
	
	private static final int INITIAL_STACK_SIZE = -1;

	private static final int MAX_STACK_SIZE = 12;

	private int[] NUMBERS = new int[MAX_STACK_SIZE];

	public int total = NOT_FOUND_RETURN;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = INITIAL_STACK_SIZE;
	}

	public boolean callCheck() {
		return total == INITIAL_STACK_SIZE;
	}

	public boolean isFull() {
		return total == MAX_STACK_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return NUMBERS[total--];
	}
}
