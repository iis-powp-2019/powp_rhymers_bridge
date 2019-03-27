package edu.kis.vh.nursery;

public class IntArrayStack {
	
	private static final int INDEX = -1;

	private static final int MAXSIZE = 12;

	private int[] numbers = new int[MAXSIZE];

	private int total = INDEX;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	boolean callCheck() {
		return total == INDEX;
	}

	boolean isFull() {
		return total == MAXSIZE-1;
	}

	int peekaboo() {
		if (callCheck())
			return INDEX;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INDEX;
		return numbers[total--];
	}


}
