package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack {

	private static final int STACK_CAPACITY = 12;

	//private static final int EMPTY_STACK_TOP = -1;

	private int[] numbers = new int[STACK_CAPACITY];

	private int total = EMPTY_STACK_TOP;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == EMPTY_STACK_TOP;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == STACK_CAPACITY - 1;
	}
		
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY_STACK_TOP;
		return numbers[total];
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY_STACK_TOP;
		return numbers[total--];
	}
}
