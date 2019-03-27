package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	//private IntArrayStack intArrayStack;
	private IntLinkedList intLinkedList = new IntLinkedList();

	public DefaultCountingOutRhymer(){
		//intArrayStack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		super();
		//this.intArrayStack = intArrayStack;
		this.intLinkedList = intLinkedList;
	}

//	public int getTotal() {
//		return intArrayStack.getTotal();
//	}

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