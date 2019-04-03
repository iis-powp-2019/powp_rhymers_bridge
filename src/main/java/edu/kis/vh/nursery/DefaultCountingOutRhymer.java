package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Default implementation for in-out rhymer
 */
public class DefaultCountingOutRhymer
{
	private IntLinkedList linkedList;
	
	public DefaultCountingOutRhymer()
	{
		this(new IntLinkedList());
	}
	
	public DefaultCountingOutRhymer(IntLinkedList linkedList)
	{
		this.linkedList = linkedList;
	}
	
	public int getTotal()
	{
		return linkedList.getTotal();
	}
	
	public void countIn(int in)
	{
		linkedList.push(in);
	}
	
	public boolean callCheck()
	{
		return linkedList.isEmpty();
	}
	
	public boolean isFull()
	{
		return linkedList.isFull();
	}
	
	public int peekaboo()
	{
		return linkedList.top();
	}
	
	public int countOut()
	{
		return linkedList.pop();
	}
}
