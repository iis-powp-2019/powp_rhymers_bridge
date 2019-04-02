package edu.kis.vh.nursery;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.StackInterface;

public class DefaultCountingOutRhymer {
	private StackInterface stack;

	public DefaultCountingOutRhymer(){
		this.stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		super();
		this.stack = intArrayStack;
	}
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		super();
		this.stack = intLinkedList;
	}

//	public int getTotal() {
//		return intArrayStack.getTotal();
//	}

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