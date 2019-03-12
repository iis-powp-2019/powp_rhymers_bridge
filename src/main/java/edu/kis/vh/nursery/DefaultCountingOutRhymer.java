package edu.kis.vh.nursery;

/**
 * Default implementation for in-out rhymer
 */
public class DefaultCountingOutRhymer
{
	
	private static final int FULL_CONSTANT = 11;
	private static final int EMPTY_CONSTANT = -1;
	private static final int EMPTY_STACK_VALUE = -1;
	public static final int MAX_SIZE = 12;
	private final int[] numbers = new int[MAX_SIZE];
	
	private int total = EMPTY_CONSTANT;
	
	/**
	 * @return number of elements in container
	 */
	int getTotal()
	{
		return total;
	}
	
	/**
	 * adds a number to the container
	 * @param in number to add
	 */
	public void countIn(int in)
	{
		if(!isFull())
			numbers[++total] = in;
	}
	
	/**
	 * checks if container is empty
	 * @return is empty?
	 */
	public boolean callCheck()
	{
		return total == EMPTY_CONSTANT;
	}
	
	public boolean isFull()
	{
		return total == FULL_CONSTANT;
	}
	
	/**
	 * checks but does not remove the next number
	 * @return next number in container
	 */
	protected int peekaboo()
	{
		if(callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}
	
	/**
	 * checks and remove the next number
	 * @return next number in container
	 */
	public int countOut()
	{
		if(callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}
	
}
