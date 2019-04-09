package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stack;

public class IntLinkedList implements Stack {

	private Node last;
	int i;
	public int total;
	
	public void push(int i) {
		if (last == null) {
			last = new Node(i);
			total = 1;
		}
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
			total += 1;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	@Override
	public int peekaboo() {
		return top();
	}

	@Override
	public int countOut() {
		return pop();
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		total -= 1;
		return ret;
	}
	
	public int getTotal(){
		return total;
	}

	@Override
	public void countIn(int in) {
		push(in);
	}

	@Override
	public boolean callCheck() {
		return isEmpty();
	}


}
