package edu.kis.vh.nursery.stack;

public interface IntArrayStackInterface {

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#getTotal()
	 */
	int getTotal();

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countIn(int)
	 */
	void countIn(int i);

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#callCheck()
	 */
	boolean callCheck();

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#isFull()
	 */
	boolean isFull();

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#peeKaBoo()
	 */
	int peeKaBoo();

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countOut()
	 */
	int countOut();

	void setTotal(int total);

}