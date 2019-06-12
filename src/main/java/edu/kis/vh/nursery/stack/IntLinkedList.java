package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IStack;

/**
 * @author tobiasz
 * Lista przechowujaca liczby całkowite.
 *
 */

public class IntLinkedList implements IStack {

    private Node last;
    private int total = EMPTY;

    @Override
    public void countIn(int i) {
        total++;
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
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
        if (callCheck())
            return EMPTY;
        return last.getValue();
    }

    @Override
    public int countOut() {
        total--;
        if (callCheck())
            return EMPTY;
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    @Override
    public int getTotal() {
        return total;
    }

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(final Node next) {
            this.next = next;
        }

    }

}