package edu.kis.vh.nursery;

//TODO: think about extracting interface and using bridge.
public class DefaultCountingOutRhymer {

	private static final int EMPTY = -1;
	private static final int NUMBERS_SIZE = 12;
	private static final int FULL = 11;
	private int[] numbers = new int[getNumbersSize()];

	private int total = getEMPTY();

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getNumbersSize() {
        return NUMBERS_SIZE;
    }

    public static int getFULL() {
        return FULL;
    }

    public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	boolean callCheck() {
		return total == getEMPTY();
	}

    boolean isFull() {
		return total == getFULL();
	}

	int peekaboo() {
		if (callCheck())
			return getEMPTY();
		return getNumbers()[total];
	}

	public int countOut() {
		if (callCheck())
			return getEMPTY();
		return getNumbers()[total--];
	}

	public int getTotal() {
		return total;
	}

	public int[] getNumbers() {
        return numbers;
    }

}
