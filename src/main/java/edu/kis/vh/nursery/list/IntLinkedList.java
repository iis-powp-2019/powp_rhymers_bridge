package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Collections;

public class IntLinkedList implements Collections {

    private static final int EMPTY = 0;
    private int total = EMPTY;
    private Node last;
    private int i;

    @Override
    public void countIn(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
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
