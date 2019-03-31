package edu.kis.vh.nursery.storage;

public class IntArrayStack  implements IntStorageInterface 
{
	private static final int MAX_SIZE = 12;
	private static final int ERROR = 0;
	private int[] numbers = new int[MAX_SIZE+1];
	private int total = ERROR;
	
	public boolean callCheck() 
	{
		return total == ERROR;
	}
	
	@Override
	public boolean isFull() 
	{
		return total == MAX_SIZE;
	}


	@Override
	public void push(int i)
	{
		if (!isFull())
			numbers[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int top()
	{
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	@Override
	public int pop()
	{
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
