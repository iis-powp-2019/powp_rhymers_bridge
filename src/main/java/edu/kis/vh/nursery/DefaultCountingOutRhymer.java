package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int minusOne = -1;
    private static final int eleven = 11;
    private static final int twelve = 12;
    private int[] numers = new int[twelve];

    private int total = minusOne;

	public void countIn(int in) {
		if (!isFull())
			numers[++total] = in;
	}

	boolean callCheck() {
		return total == minusOne;
	}

	boolean isFull() {
		return total == eleven;
	}

	int peekaboo() {
		if (callCheck())
			return minusOne;
		return numers[total];
	}

	int countOut() {
		if (callCheck())
			return minusOne;
		return numers[total--];
	}

}
