package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    Stack intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stack intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public int getTotal() {
        return intLinkedList.getTotal();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean isCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
