package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.*;

public class DefaultCountingOutRhymer {

	IntLinkedList stack;

	public DefaultCountingOutRhymer() {
		super();
		this.stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList stack) {
		super();
		this.stack = stack;
	}

	public int getTotal() {
		int total = 0;
		IntLinkedList tmp = stack;
		while (!tmp.isEmpty()) {
			tmp.pop();
			total++;
		}
		return total;
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}

}

//alt + -> przechodzi do edytowanego pliku "następnego"
//alt + <- przechodzi do edytowanego pliku "poprzedniego"
