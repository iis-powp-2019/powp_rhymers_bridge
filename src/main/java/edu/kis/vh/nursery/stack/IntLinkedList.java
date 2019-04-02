package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.Collections;

public class IntLinkedList implements Collections {

    private static final int EMPTY = 0;
    private int total = 0;
    private Node last;
    private int i;

    @Override
    public void countIn(int i) {
        if (last == null) {
            last = new Node(i);
            total++;
        } else {
            last.setNext(new Node(i));
            total++;
            last.getNext()
                .setPrev(last);

            last = last.getNext();
        }
    }

    @Override
    public boolean callCheck() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        return total;
    }

    public int top() {
        if (callCheck()) {
            return EMPTY;
        }
        return last.getValue();
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY;
        }
        int ret = last.getValue();
        last = last.getPrev();
        total--;
        return ret;
    }

    @Override
    public int getTotal() {
        return i;
    }

    private Node getLast() {
        return last;
    }

}
