package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == -1;
		}
		
		public boolean isFull() { //formatowanie kodu: za duze wciecie.
			return total == 11;
		}
		
		protected int peekaboo() { //formatowanie kodu: za duze wciecie x2
			if (callCheck())
				return -1;
			return NUMBERS[total];
		}
			
		public int countOut() { //formatowanie kodu: za duze wcięcie x3
			if (callCheck())
				return -1;
			return NUMBERS[total--];
		}

}
