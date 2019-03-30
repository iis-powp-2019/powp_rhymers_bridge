package edu.kis.vh.nursery.storage;

/**
 * Class of default type rhymer
 */
public class IntArrayStack implements StackInterface{

	private static final int STACK_CAPACITY = 11;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_VALUE;

	/**
	 * Adds number to rhymer
	 * @param in value to add to the rhymer
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Checks if rhymer number storage is empty
	 * @return true when rhymers can store no more numbers
	 */ 
	public boolean callCheck() {
		return total == EMPTY_STACK_VALUE;
	}

	/**
	 * Checks if rhymer number storage is full
	 * @return true when rhymers can store no more numbers
	 */
	public boolean isFull() {
		return total == STACK_CAPACITY-1;
	}

	/**
	 * Gets value of last added number
	 * @return last added number
	 */
	public int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}

	/**
	 * Gets value of last added number, popping it from rhymer storage
	 * @return last added number
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}

	@Override
	public void push(int i) {
		if (!isFull())
            numbers[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	@Override
	public int top() {
		if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
	}

}
