package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * @author modyfikacji Damian Golema
 *
 */
public class DefaultCountingOutRhymer 
{
	private IntArrayStack ias;
	private IntLinkedList ill = new IntLinkedList();
	
	public DefaultCountingOutRhymer() 
	{
		this.ias = null;
	}
	public DefaultCountingOutRhymer(IntArrayStack ias) 
	{
		this.ias = ias;
	}

	public void countIn(int in) 
	{
		ill.push(in);
	}
	public boolean callCheck() 
	{
		return ill.isEmpty();
	}
	public boolean isFull() 
	{
		return false;
	}
	public int countOut() 
	{
		return ill.pop();
	}
	public int peekaboo() 
	{
		return ill.top();
	}	

}
