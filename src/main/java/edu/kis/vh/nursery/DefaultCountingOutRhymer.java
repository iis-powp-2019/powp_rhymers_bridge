package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int DEFAULT = 12;

	public static final int STACK_CAPACITY = -1;

	private int[] numbers = new int[DEFAULT];

	public int total = STACK_CAPACITY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == STACK_CAPACITY;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return STACK_CAPACITY;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return STACK_CAPACITY;
						return numbers[total--];
					}

}
