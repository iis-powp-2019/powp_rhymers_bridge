package edu.kis.vh.nursery.stack;



public class IntLinkedList implements IntArrayStackInterface{

	Node last;
	private int i;
	private static final int EMPTY_INDEX = -1;
    int total = EMPTY_INDEX;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#getTotal()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#getTotal()
	 */
	@Override
	public int getTotal() {
	   return total;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countIn(int)
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countIn(int)
	 */
	@Override
	public void countIn(int i) {
	
			total++;
			if (last == null)
				last = new Node(i);
			else {
				last.next = new Node(i);
				last.next.prev = last;
				last = last.next;
			}
		}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#callCheck()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#isFull()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#peeKaBoo()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#peeKaBoo()
	 */
	@Override
	public int peeKaBoo() {
		if(callCheck()) return EMPTY_INDEX;
		return last.getValue();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countOut()
	 */
	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.IntArrayStackInterface#countOut()
	 */
	@Override
	public int countOut() {
		total--;
		if(callCheck()) return EMPTY_INDEX;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

	@Override
	public void setTotal(int total) {
		// TODO Auto-generated method stub
		
	}

	

}
