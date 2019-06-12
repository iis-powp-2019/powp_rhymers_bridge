package edu.kis.vh.nursery.list;

/**
 * @author tobiasz
 * Lista przechowujaca liczby całkowite.
 *
 */

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int total = EMPTY;

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

    public boolean callCheck() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return last.getValue();
    }

    public int countOut() {
        total--;
        if (callCheck())
            return EMPTY;
        final int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

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