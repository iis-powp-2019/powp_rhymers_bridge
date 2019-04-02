package edu.kis.vh.nursery;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.StackInterface;

public class DefaultCountingOutRhymer {
	//private IntArrayStack intArrayStack;
	private StackInterface intLinkedList = new IntLinkedList();

	public DefaultCountingOutRhymer(){
		//intArrayStack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(StackInterface intLinkedList) {
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