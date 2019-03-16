package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int MINUS_JEDEN = -1;
	private static final int DWANASCIE = 12;
	private int[] NUMBERS = new int[DWANASCIE];


	private int total = MINUS_JEDEN;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == MINUS_JEDEN;
		}
		
		public boolean isFull() { //formatowanie kodu: za duze wciecie.
			return total == 11;
		}
		
		protected int peekaboo() { //formatowanie kodu: za duze wciecie x2
			if (callCheck())
				return MINUS_JEDEN;
			return NUMBERS[total];
		}
			
		public int countOut() { //formatowanie kodu: za duze wcięcie x3
			if (callCheck())
				return MINUS_JEDEN;
			return NUMBERS[total--];
		}

}
