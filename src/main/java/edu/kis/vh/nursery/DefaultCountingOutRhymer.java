package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TWELVE = 12;
	private static final int MINUS_ONE = -1;
	private static final int FULL = 11;

	private int[] numbers = new int[TWELVE];

	public int total = MINUS_ONE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == MINUS_ONE;
	}
		
	public boolean isFull() {
		return total == FULL;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return MINUS_ONE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return MINUS_ONE;
		return numbers[total--];
	}

}
