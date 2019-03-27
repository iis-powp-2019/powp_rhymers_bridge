package edu.kis.vh.nursery;

public class IntArrayStack {

        private static final int STACK_CAPACITY = 12;
        private static final int EMPTY_STACK_VALUE = -1;

        private int[] numbers = new int[STACK_CAPACITY];
        private int total = -1;

        public int getTotal() {
            return total;
        }

        public void countIn(int in) {
            if (!isFull()){
                numbers[++total] = in;
            }
        }

        boolean isEmpty() {
            return total == EMPTY_STACK_VALUE;
        }

        boolean isFull() {
            return total == STACK_CAPACITY-1;
        }

        int currentNumber() {
            if (isEmpty()){
                return EMPTY_STACK_VALUE;
            }else{
                return numbers[total];
            }
        }

        public int countOut() {
            if (isEmpty()) {
                return EMPTY_STACK_VALUE;
            } else {
                return numbers[total--];
            }
        }
}
