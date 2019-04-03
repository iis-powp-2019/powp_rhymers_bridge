package edu.kis.vh.nursery.list;

public class IntLinkedList implements IIntCounter
{
	Node last;
	int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDEX;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDEX;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}

class Node {
	public int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}