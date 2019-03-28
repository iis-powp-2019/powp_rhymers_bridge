package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private static final int error = -1;

	private static final int maxArraySize = 12;

	private int[] numbers = new int[maxArraySize];

	private int total = error;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	
	public boolean callCheck() {
		return total == error;
	}
	
	public boolean isFull() {
		return total == 11;
	}
	
	public int getTotal() {
		return total;
	}
	
	protected int peekaboo() {
		if (callCheck())
			return error;
		return numbers[total];
	}
	
	public int countOut() {
		if (callCheck())
			return error;
		return numbers[total--];
	}
	/*private IntArrayStack arrayStack;

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
    }*/
    
    
}


