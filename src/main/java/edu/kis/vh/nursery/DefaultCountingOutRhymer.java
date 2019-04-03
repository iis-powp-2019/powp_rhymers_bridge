package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.*;

public class DefaultCountingOutRhymer {

	Stackable stack;

	public DefaultCountingOutRhymer() {
		super();
		stack = new IntLinkedListAdapter(new IntLinkedList());
	}

	public DefaultCountingOutRhymer(Stackable stack) {
		super();
		this.stack = stack;
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

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

}

//alt + -> przechodzi do edytowanego pliku "następnego"
//alt + <- przechodzi do edytowanego pliku "poprzedniego"
