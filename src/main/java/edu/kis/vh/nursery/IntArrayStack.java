package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class IntArrayStack {
	private int[] NUMBERS = new int[12];


	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peeKaBoo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
