package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public IntArrayStack ArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack arrayStack) {
        ArrayStack = arrayStack;
    }

    public DefaultCountingOutRhymer(){
        ArrayStack = new IntArrayStack();
    }

    int getTotal() {
        return ArrayStack.getTotal();
    }

    void countIn(int in) {
        ArrayStack.countIn(in);
    }

    boolean callCheck() {
        return ArrayStack.callCheck();
    }

    boolean isFull() {
        return ArrayStack.isFull();
    }

    int peekaboo() {
        return ArrayStack.peekaboo();
    }

    int countOut() {
        return ArrayStack.countOut();
    }
}
