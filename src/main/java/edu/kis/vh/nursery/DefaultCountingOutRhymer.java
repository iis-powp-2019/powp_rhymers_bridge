package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int INDEX_OF_EMPTY_STACK = -1;
    private static final int STACK_CAPACITY = 12;
    private static final int INDEX_OF_FULL_STACK = 11;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = INDEX_OF_EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INDEX_OF_EMPTY_STACK;
    }

    public boolean isFull() {
        return total == INDEX_OF_FULL_STACK;
    }

    protected int peekaboo() {
        if (callCheck())
            return INDEX_OF_EMPTY_STACK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INDEX_OF_EMPTY_STACK;
        return numbers[total--];
    }

	public int getTotal() {
		return total;
	}
}
