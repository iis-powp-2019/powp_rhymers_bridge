package edu.kis.vh.nursery;

public class IntArrayStack {

	private static final int EMPTY = -1;
	private static final int SIZE = 12;
	private static final int FULL = SIZE - 1;

	private int[] numbers = new int[SIZE];

	private int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	private boolean callCheck() {
		return total == EMPTY;
	}
		
	private boolean isFull() {
		return total == FULL;
	}
		
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}
	
}
