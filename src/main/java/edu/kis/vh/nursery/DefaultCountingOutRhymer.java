package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntLinkedList;
import edu.kis.vh.nursery.stackImplementation.StackInterface;

public class DefaultCountingOutRhymer {

    //IntArrayStack intArrayStack;
    StackInterface stackInterface;

    public DefaultCountingOutRhymer(StackInterface stackInterface) {
        //this.intArrayStack = intArrayStack;
        this.stackInterface = stackInterface;

    }

    public DefaultCountingOutRhymer() {
        this.stackInterface = new IntLinkedList();
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        stackInterface.push(in);
    }

    public boolean callCheck() {
        return //intArrayStack.callCheck();
                stackInterface.isEmpty();
    }

    public boolean isFull() {
        return //intArrayStack.isFull();
                stackInterface.isFull();
    }

    public int peekaboo() {
        return //intArrayStack.peekaboo();
                stackInterface.top();
    }

    public int countOut() {
        return //intArrayStack.countOut();
                stackInterface.pop();
    }
}
