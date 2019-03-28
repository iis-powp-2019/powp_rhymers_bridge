package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		super();
		this.stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
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
