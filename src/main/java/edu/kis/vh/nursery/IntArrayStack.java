package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStackInterface;
import edu.kis.vh.nursery.list.IntLinkedList;

public class IntArrayStack implements IntArrayStackInterface {
	private int[] NUMBERS = new int[12];


	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#setTotal(int)
	 */
	@Override
	public void setTotal(int total) {
		this.total = total;
	}

	public int total = -1;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == -1;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}
		
	public int peeKaBoo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntArrayStackInterface#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
