package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack){
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(){
        this.intArrayStack = new IntArrayStack();
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
        intArrayStack.countIn(in);
    }

    public boolean isEmpty() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int currentNumber() {
        return intArrayStack.currentNumber();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
