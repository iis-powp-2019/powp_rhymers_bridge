package edu.kis.vh.nursery;
class Node {

	public int getValue() {
		return value;
	}


	private int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

public class DefaultCountingOutRhymer {

	private static final int DEFAULT_INDEX_STACK = -1;

	private static final int NOT_FOUND_RETURN = -1;

	private static final int MAX_SIZE_STACK = 12;

	private final int[] numbers = new int[getMaxSizeStack()];

	private int total = getDefaultIndexStack();

	private static int getDefaultIndexStack() {
		return DEFAULT_INDEX_STACK;
	}

	private static int getNotFoundReturn() {
		return NOT_FOUND_RETURN;
	}

	private static int getMaxSizeStack() {
		return MAX_SIZE_STACK;
	}

	protected void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	protected boolean callCheck() {
		return total == getDefaultIndexStack();
	}

	protected boolean isFull() {
		return total == getMaxSizeStack() -1;
	}

	protected int peekaboo() {
		if (callCheck())
			return getNotFoundReturn();
		return getNumbers()[total];
	}

	protected int countOut() {
		if (callCheck())
			return getNotFoundReturn();
		return getNumbers()[total--];
	}

	public int getTotal() {
		return total;
	}

	private int[] getNumbers() {
		return numbers;
	}

}
