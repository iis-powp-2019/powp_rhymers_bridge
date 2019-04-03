package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IntStack;
import edu.kis.vh.nursery.stack.IntLinkedList.Node;

public class IntLinkedListAdapter implements IntStack {
	
	private IntLinkedList list;
	
	public IntLinkedListAdapter(IntLinkedList list) {
		this.list = list;
	}

	@Override
	public int getTotal() {
		Node n = list.getLast();
		if(list.isEmpty()) return 0;
		int size=1;
		while(n.getPrev() != null) {
			n = n.getPrev();
			size++;
		}
		return size;
	}

	@Override
	public void countIn(int in) {
		list.push(in);
		
	}

	@Override
	public boolean callCheck() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return list.isFull();
	}

	@Override
	public int countOut() {
		return list.pop();
	}

	@Override
	public int peekaboo() {
		return list.top();
	}

}
