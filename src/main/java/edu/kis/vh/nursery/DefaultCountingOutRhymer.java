package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntLinkedListAdapter;
import edu.kis.vh.nursery.stack.IntLinkedList.Node;

public class DefaultCountingOutRhymer {
	
	IntStack stack;
	
	public DefaultCountingOutRhymer() {

		stack = new IntLinkedListAdapter(new IntLinkedList());
	}
	

	public int getTotal() {
		
		return stack.getTotal();
	}

	public void countIn(int in) {
		
		stack.countIn(in);
	}

	public boolean callCheck() {
		
		return stack.callCheck();
	}

	public boolean isFull() {
		
		return stack.isFull();
	}

	public int countOut() {
		
		return stack.countOut();
	}

	public DefaultCountingOutRhymer(IntStack stack) {
		super();
		this.stack = stack;
	}
	
	public int peekaboo() {
		
		return stack.peekaboo();
	}

}
