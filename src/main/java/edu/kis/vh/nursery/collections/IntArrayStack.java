package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.StackInterface;

public class IntArrayStack {

	private static final int MAXSIZE = 12;

	private int[] numbers = new int[MAXSIZE];

	private int total = StackInterface.INDEX;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == StackInterface.INDEX;
	}

	public boolean isFull() {
		return total == MAXSIZE-1;
	}

	public int peekaboo() {
		if (callCheck())
			return StackInterface.INDEX;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return StackInterface.INDEX;
		return numbers[total--];
	}


}
