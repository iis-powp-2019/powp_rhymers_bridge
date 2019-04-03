package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IStack;
import edu.kis.vh.nursery.containers.IntArrayStack;
import edu.kis.vh.nursery.containers.IntLinkedList;

public class FIFORhymer
		extends DefaultCountingOutRhymer
{
	
	// ArrayStack chyba lepszy
	private IStack temp = new IntArrayStack();
	
	public FIFORhymer()
	{
	}
	
	public FIFORhymer(IntLinkedList linkedList)
	{
		super(linkedList);
	}
	
	@Override
	public int countOut()
	{
		while(!callCheck())
			temp.push(super.countOut());
		
		final int ret = temp.pop();
		
		while(!temp.isEmpty())
			countIn(temp.pop());
		
		return ret;
	}
}
