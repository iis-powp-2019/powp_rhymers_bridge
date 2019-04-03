package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntLinkedList;

public class FIFORhymer
		extends DefaultCountingOutRhymer
{
	
	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	FIFORhymer(IntLinkedList linkedList)
	{
		super(linkedList);
	}
	
	@Override
	public int countOut()
	{
		while(!callCheck())
			temp.countIn(super.countOut());
		
		final int ret = temp.countOut();
		
		while(!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
