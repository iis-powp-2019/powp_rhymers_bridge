package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntLinkedList.Node;

public class DefaultCountingOutRhymer {
	
	IntArrayStack stack;
	
	IntLinkedList list;
	
	public DefaultCountingOutRhymer() {
		//stack = new IntArrayStack();
		
		list = new IntLinkedList();
	}
	

	public int getTotal() {
		//tablica
		//return stack.getTotal();
		
		//lista
		Node n = list.getLast();
		if(list.isEmpty()) return 0;
		int size=1;
		while(n.getPrev() != null) {
			n = n.getPrev();
			size++;
		}
		return size;
	}

	public void countIn(int in) {
		//tablica
		//stack.countIn(in);
		
		//lista
		list.push(in);
	}

	public boolean callCheck() {
		//tablica
		//return stack.callCheck();
		
		//lista
		return list.isEmpty();
	}

	public boolean isFull() {
		//tablica
		//return stack.isFull();
		
		//lista
		return list.isFull();
	}

	public int countOut() {
		//tablica
		//return stack.countOut();
		
		//lista
		return list.pop();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}
	
	protected int peekaboo() {
		//tablica
		//return stack.peekaboo();
		
		//lista
		return list.top();
	}

}
