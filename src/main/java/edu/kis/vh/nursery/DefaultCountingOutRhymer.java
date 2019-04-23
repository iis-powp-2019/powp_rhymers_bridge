package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Interface;
//3.1.5 zmiana typu atrybutu została dokonana automatycznie
public class DefaultCountingOutRhymer {

	Interface intLinkedList = new IntLinkedList();

	public DefaultCountingOutRhymer(Interface intLinkedList) {
		super();
		this.intLinkedList = intLinkedList;
	}

	public DefaultCountingOutRhymer() {}

	public int getTotal() {
		return intLinkedList.getTotal();
	}

	public void setTotal(int total) {
		intLinkedList.setTotal(total);
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	public int peekaboo() {
		return intLinkedList.top();
	}

	public int countOut() {
		return intLinkedList.pop();
	}

}
