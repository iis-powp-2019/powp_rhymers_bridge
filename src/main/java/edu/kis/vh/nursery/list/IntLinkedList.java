package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;
	private int i;
	private static final int EMPTY_INDEX = -1;
    int total = EMPTY_INDEX;

	public int getTotal() {
	   return total;
	}
	
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

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}
	
	public int peeKaBoo() {
		if(callCheck()) return EMPTY_INDEX;
		return last.getValue();
	}

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

	

}
