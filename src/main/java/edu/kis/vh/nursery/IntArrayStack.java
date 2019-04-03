package edu.kis.vh.nursery;

public class IntArrayStack
		implements IStack
{
	
	private static final int FULL_CONSTANT = 11;
	private static final int EMPTY_CONSTANT = -1;
	private static final int EMPTY_STACK_VALUE = -1;
	public static final int MAX_SIZE = FULL_CONSTANT + 1;
	private final int[] numbers = new int[MAX_SIZE];
	
	private int total = EMPTY_CONSTANT;
	
	/**
	 * @return number of elements in container
	 */
	public int getTotal()
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
	
	@Override
	public void push(int i)
	{
		countIn(i);
	}
	
	@Override
	public boolean isEmpty()
	{
		return callCheck();
	}
	
	@Override
	public boolean isFull()
	{
		return total == FULL_CONSTANT;
	}
	
	@Override
	public int top()
	{
		return peekaboo();
	}
	
	@Override
	public int pop()
	{
		return countOut();
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
