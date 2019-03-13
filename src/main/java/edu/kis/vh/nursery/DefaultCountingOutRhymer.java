package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int STACK_SIZE = 12;
    public static final int STACK_VALUE = -1;

    private int[] numbers = new int[STACK_SIZE];

	public int total = STACK_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STACK_VALUE;
	}

	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	protected int peekaboo() {
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
