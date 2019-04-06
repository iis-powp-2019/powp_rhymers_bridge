package edu.kis.vh.nursery;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.*
public class DefaultCountingOutRhymer {
    protected StackListInterface intArrayStack = new IntLinkedList();

    public DefaultCountingOutRhymer() {

    }

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {

    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    protected int peekaboo() {
        return intArrayStack.top();
    }

    public int countOut() { return intArrayStack.pop();
    }

}
