package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{
	
	private static final int FULL_CONSTANT = 11;
	private static final int EMPTY_CONSTANT = -1;
	private static final int EMPTY_STACK_VALUE = -1;
	public static final int MAX_SIZE = 12;
	private final int[] numbers = new int[MAX_SIZE];
	
	private int total = EMPTY_CONSTANT;
	
	int getTotal()
	{
		return total;
	}
	
	public void countIn(int in)
	{
		if(!isFull())
			numbers[++total] = in;
	}
	
	public boolean callCheck()
	{
		return total == EMPTY_CONSTANT;
	}
	
	public boolean isFull()
	{
		return total == FULL_CONSTANT;
	}
	
	protected int peekaboo()
	{
		if(callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total];
	}
	
	public int countOut()
	{
		if(callCheck())
			return EMPTY_STACK_VALUE;
		return numbers[total--];
	}
	
}
