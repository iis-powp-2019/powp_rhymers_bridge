package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
{

	private static final int SIZE = 12;
	private static final int ERROR = -1;

	private int[] NUMBERS = new int[SIZE];

	private int total = ERROR;

	public int getTotal() 
	{
		return total;
	}

	public void setTotal(int total) 
	{
		this.total = total;
	}

	public void countIn(int in) 
	{
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() 
	{
		return total == ERROR;
	}
	
	public boolean isFull() 
	{
		return total == SIZE-1;
	}

	protected int peekaboo() 
	{
		if (callCheck())
			return ERROR;
		return NUMBERS[total];
	}

	public int countOut() 
	{
		if (callCheck())
			return ERROR;
		return NUMBERS[total--];
	}

}
