package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.stacks.IntArrayStack;
import edu.kis.vh.nursery.stack.Stack;
import edu.kis.vh.nursery.stack.stacks.LinkedListOfIntegers;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;
    private LinkedListOfIntegers linkedListOfIntegers;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(LinkedListOfIntegers linkedListOfIntegers){
        this.linkedListOfIntegers = linkedListOfIntegers;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = new IntArrayStack();
        this.linkedListOfIntegers = new LinkedListOfIntegers();
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
        linkedListOfIntegers.push(in);
    }

    public boolean isEmpty() {
        return linkedListOfIntegers.isEmpty();
    }

    public boolean isFull() {
        return linkedListOfIntegers.isFull();
    }

    public int currentNumber() {
        return linkedListOfIntegers.top();
    }

    public int countOut() {
        return linkedListOfIntegers.pop();
    }
}
