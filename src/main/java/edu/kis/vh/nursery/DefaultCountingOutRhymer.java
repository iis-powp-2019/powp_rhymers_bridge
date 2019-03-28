package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntegerLinkedList;

public class DefaultCountingOutRhymer {

    private IntegerLinkedList integerLinkedList;

    public DefaultCountingOutRhymer(IntegerLinkedList integerLinkedList) {
        this.integerLinkedList = integerLinkedList;
    }

    public DefaultCountingOutRhymer() {
        integerLinkedList = new IntegerLinkedList();
    }

    public void countIn(int input) {
        integerLinkedList.push(input);
    }

    public boolean callCheck() {
        return integerLinkedList.isEmpty();
    }

    public boolean isFull() {
        return integerLinkedList.isFull();
    }

    public int peekaboo() {
        return integerLinkedList.top();
    }

    public int countOut() {
        return integerLinkedList.pop();
    }

    public int getTotal() {
        return integerLinkedList.getTotal();
    }
}
