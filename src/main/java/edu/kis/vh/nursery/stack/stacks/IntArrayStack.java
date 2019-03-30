package edu.kis.vh.nursery.stack.stacks;

import edu.kis.vh.nursery.stack.Stack;

public class IntArrayStack implements Stack {

        private static final int STACK_CAPACITY = 12;

        private int[] numbers = new int[STACK_CAPACITY];
        private int total = -1;

        public int getTotal() {
            return total;
        }

        @Override
        public void push(int in) {
            if (!isFull()){
                numbers[++total] = in;
            }
        }

        @Override
        public boolean isEmpty() {
            return total == EMPTY_STACK_VALUE;
        }

        @Override
        public boolean isFull() {
            return total == STACK_CAPACITY-1;
        }

        @Override
        public int top() {
            if (isEmpty()){
                return EMPTY_STACK_VALUE;
            }else{
                return numbers[total];
            }
        }

        @Override
        public int pop() {
            if (isEmpty()) {
                return EMPTY_STACK_VALUE;
            } else {
                return numbers[total--];
            }
        }
}
