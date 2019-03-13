package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int STACK_SIZE = 12;
    private static final int STACK_VALUE = -1;

    private int[] numbers = new int[STACK_SIZE];

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = STACK_VALUE;

	protected void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	protected boolean callCheck() {
		return total == STACK_VALUE;
	}

	protected boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total];
	}

	protected int countOut() {
		if (callCheck())
			return STACK_VALUE;
		return numbers[total--];
	}

}
