package edu.kis.vh.nursery;
import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stackable;

public class DefaultCountingOutRhymer {

	private Stackable stackable;

	public DefaultCountingOutRhymer() {
		stackable = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		stackable = intLinkedList;
	}

	public void countIn(int in) {
		stackable.push(in);
	}

	public int countOut() {
		return stackable.pop();
	}

	boolean callCheck() {
		return stackable.isEmpty();
	}

	boolean isFull() {
		return false;
	}

	int peekaboo() {
		if (stackable.isEmpty())
			return -1;
		return stackable.top();
	}
}
