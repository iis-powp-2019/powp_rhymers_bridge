package edu.kis.vh.nursery.list;

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

	public boolean callCheck() {
		return total == INDEX;
	}

	public boolean isFull() {
		return total == MAXSIZE-1;
	}

	public int peekaboo() {
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
