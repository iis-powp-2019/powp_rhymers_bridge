package edu.kis.vh.nursery;
import edu.kis.vh.nursery.container.IntArrayStack;
import edu.kis.vh.nursery.container.IntLinkedList;

public class DefaultCountingOutRhymer {

    StackInterface stackInterface;

    public DefaultCountingOutRhymer(StackInterface list) {
        this.stackInterface = list;
    }
    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.stackInterface = list;
    }
    public DefaultCountingOutRhymer(IntArrayStack list) {
        this.stackInterface = list;
    }
    public DefaultCountingOutRhymer() {
        this.stackInterface=new IntArrayStack();
    }

    public void countIn(int in) {
        stackInterface.countIn(in);
    }

    public boolean callCheck() { return stackInterface.callCheck(); }

    public boolean isFull() { return stackInterface.isFull(); }

    protected int peekaboo() {
        return stackInterface.peekaboo();
    }

    public int countOut() {
        return stackInterface.countOut();
    }
}
