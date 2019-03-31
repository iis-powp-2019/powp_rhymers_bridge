package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer 
{

	private int totalRejected = 0;

	public int reportRejected() 
	{
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) 
	{
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

	public HanoiRhymer() 
	{
		super();
	}

	public HanoiRhymer(IntStorageInterface i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

}