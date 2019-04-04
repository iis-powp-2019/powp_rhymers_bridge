package edu.kis.vh.nursery;
import edu.kis.vh.nursery.container.IntLinkedList;

public class DefaultCountingOutRhymer {

    IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.intLinkedList = list;
    }
    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() { return intLinkedList.isEmpty(); }

    public boolean isFull() { return intLinkedList.isFull(); }

    protected int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
