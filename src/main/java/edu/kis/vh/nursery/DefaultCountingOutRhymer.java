package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{
	
	public static final int FULL_CONSTANT = 11;
	public static final int EMPTY_CONSTANT = -1;
	public static final int EMPTY_STACK_VALUE = -1;
	private int[] numbers = new int[12];
	
	public int total = EMPTY_CONSTANT;
	
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
