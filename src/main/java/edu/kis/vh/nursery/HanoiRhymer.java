package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntLinkedList;

public class HanoiRhymer
		extends DefaultCountingOutRhymer
{
	
	private int totalRejected = 0;
	
	HanoiRhymer(IntLinkedList linkedList)
	{
		super(linkedList);
	}
	
	public int reportRejected()
	{
		return totalRejected;
	}
	
	@Override
	public void countIn(final int in)
	{
		if(!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	
	// alt+lewo/prawo: przejscie do poprzedniego/kolejnego edytwoanego pliku
}
