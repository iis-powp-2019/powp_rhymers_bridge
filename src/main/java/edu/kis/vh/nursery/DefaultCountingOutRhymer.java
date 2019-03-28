package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private IntArrayStack arrayStack;

	public DefaultCountingOutRhymer(IntArrayStack arrayStack) {
		super();
		this.arrayStack = arrayStack;
	}

	public DefaultCountingOutRhymer() {
		this.arrayStack = new IntArrayStack();
	}

	public void countIn(int in) {
		arrayStack.countIn(in);
	}

	public boolean callCheck() {
		return arrayStack.callCheck();
	}

	public boolean isFull() {
		return arrayStack.isFull();
	}

	public int getTotal() {
		return arrayStack.getTotal();
	}

	public int countOut() {
		return arrayStack.countOut();
	}
	
    public int peekaboo() {
        return arrayStack.peekaboo();
    }    
}


