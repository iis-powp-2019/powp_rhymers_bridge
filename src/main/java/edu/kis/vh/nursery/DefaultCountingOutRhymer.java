package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int DEFAULT_INDEX_STACK = -1;
	
	private static final int NOT_FOUND_RETURN = -1;

	private static final int MAX_SIZE_STACK = 12;

	private int[] numbers = new int[MAX_SIZE_STACK];

	public int total = DEFAULT_INDEX_STACK;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT_INDEX_STACK;
	}

	public boolean isFull() {
		return total == MAX_SIZE_STACK-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total--];
	}

}
