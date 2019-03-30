package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;
import edu.kis.vh.nursery.stack.stacks.IntArrayStack;
import edu.kis.vh.nursery.stack.stacks.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;
    private Stack stack = new IntLinkedList();

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(Stack stack) {
        this.setStack(stack);
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
        this.stack = new IntLinkedList();
    }

    public IntArrayStack getIntArrayStack() {
        return intArrayStack;
    }

    public void setIntArrayStack(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int currentNumber() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }
}
