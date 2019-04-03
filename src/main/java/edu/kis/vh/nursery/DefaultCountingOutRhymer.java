package edu.kis.vh.nursery;

/**
 * Default implementation for in-out rhymer
 */
public class DefaultCountingOutRhymer
{
	private IntArrayStack arrayStakc;
	
	DefaultCountingOutRhymer()
	{
		this(new IntArrayStack());
	}
	
	DefaultCountingOutRhymer(IntArrayStack arrayStakc)
	{
		this.arrayStakc = arrayStakc;
	}
	
	public int getTotal()
	{
		return arrayStakc.getTotal();
	}
	
	public void countIn(int in)
	{
		arrayStakc.countIn(in);
	}
	
	public boolean callCheck()
	{
		return arrayStakc.callCheck();
	}
	
	public boolean isFull()
	{
		return arrayStakc.isFull();
	}
	
	public int peekaboo()
	{
		return arrayStakc.peekaboo();
	}
	
	public int countOut()
	{
		return arrayStakc.countOut();
	}
}
