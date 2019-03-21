package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack atrybut;

	public DefaultCountingOutRhymer() {
	}
	
	public DefaultCountingOutRhymer(IntArrayStack atrybut) {
		super();
		this.atrybut = atrybut;
	}

	public void countIn(int in) {
		atrybut.countIn(in);
	}

	public boolean callCheck() {
		return atrybut.callCheck();
	}

	public boolean isFull() {
		return atrybut.isFull();
	}

	public int peekaboo() {
		return atrybut.peekaboo();
	}

	public int countOut() {
		return atrybut.countOut();
	}
}
