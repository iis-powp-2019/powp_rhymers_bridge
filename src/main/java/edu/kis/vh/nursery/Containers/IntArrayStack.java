package edu.kis.vh.nursery.Containers;

public class IntArrayStack implements StackInterface {

	private static final int INITIAL_STACK_SIZE = -1;

	private int[] numbers = new int[MAX_STACK_SIZE];

	private int total = INITIAL_STACK_SIZE;

	@Override
    public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

    @Override
    public int countOut() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total--];
	}

    @Override
    public boolean callCheck() {
		return total == INITIAL_STACK_SIZE;
	}

    @Override
    public int peekaboo() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return numbers[total];
	}

    @Override
    public boolean isFull() {
		return total == MAX_STACK_SIZE - 1;
	}

}
