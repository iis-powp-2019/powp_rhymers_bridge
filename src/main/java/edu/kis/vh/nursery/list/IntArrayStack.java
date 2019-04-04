package edu.kis.vh.nursery.list;

public class IntArrayStack {
	private static final int NOT_FOUND_RETURN = -1;

	private static final int INITIAL_STACK_SIZE = -1;

	private static final int MAX_STACK_SIZE = 12;

	private int[] numbers = new int[MAX_STACK_SIZE];

	private int total = INITIAL_STACK_SIZE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

    public int countOut() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total--];
	}

    public boolean callCheck() {
		return total == INITIAL_STACK_SIZE;
	}

    public int peekaboo() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total];
	}

    public boolean isFull() {
		return total == MAX_STACK_SIZE - 1;
	}

}
