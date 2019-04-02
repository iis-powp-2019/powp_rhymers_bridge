package edu.kis.vh.nursery.stack;

public class IntArrayStack implements StackInterface {
		private static final int FULL_STACK_VALUE = 11;
		private static final int STACK_CAPACITY = 12;
		private int[] numbers = new int[STACK_CAPACITY];
		private int total = EMPTY_STACK_VALUE;

		public int getTotal() {
			return total;
		}

		public void push(int in) {
			if (!isFull())
				numbers[++total] = in;
		}

		public boolean isEmpty() {
			return total == EMPTY_STACK_VALUE;
		}

		public boolean isFull() {
			return total == FULL_STACK_VALUE;
		}

		public int top() {
			if (isEmpty())
				return EMPTY_STACK_VALUE;
			return numbers[total];
		}

		public int pop() {
			if (isEmpty())
				return EMPTY_STACK_VALUE;
			return numbers[total--];
		}
}
