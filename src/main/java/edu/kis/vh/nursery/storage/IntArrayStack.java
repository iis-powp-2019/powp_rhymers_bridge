package edu.kis.vh.nursery.storage;

public class IntArrayStack implements IntStorageInterface{
	private static final int MAX_STACK_SIZE = 12;

	private static final int EMPTY_STACK_INDEX = -1;

	private int[] numbers = new int[MAX_STACK_SIZE + 1];
	
	private int total = RETURN_DEFAULT;

	public int[] getNumbers() {
		return numbers;
	}

	public static int getInitialStackIndex() {
		return EMPTY_STACK_INDEX;
	}

	public static int getReturnDefault() {
		return RETURN_DEFAULT;
	}

	public static int getMaxStackSize() {
		return MAX_STACK_SIZE;
	}

	@Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == MAX_STACK_SIZE;
    }

    @Override
    public int peekaboo() {
		if (isEmpty())
			return RETURN_DEFAULT;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
            return EMPTY_STACK_INDEX;
        return numbers[total--];
	}
	
	public int getTotal() {
        return total;
    }

}