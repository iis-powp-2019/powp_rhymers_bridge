package edu.kis.vh.nursery;

/**
 * @author modyfikacji Damian Golema
 *
 */
public class DefaultCountingOutRhymer 
{
	private IntArrayStack ias;

	public DefaultCountingOutRhymer() 
	{
		this.ias = null;
	}
	public DefaultCountingOutRhymer(IntArrayStack ias) 
	{
		this.ias = ias;
	}
	
	public void countIn(int in) {
		ias.countIn(in);
	}
	public boolean callCheck() {
		return ias.callCheck();
	}
	public boolean isFull() {
		return ias.isFull();
	}
	public int countOut() {
		return ias.countOut();
	}
	public int peekaboo() {
		return ias.peekaboo();
	}
	
	

}
