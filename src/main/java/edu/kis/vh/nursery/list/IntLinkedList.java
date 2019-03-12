package edu.kis.vh.nursery.list;

/*
 * TODO: needs refactoring to either limit maximum list size and implement isFull() method property,
 *       or delete members that serve no functionality
 */
public class IntLinkedList {

    private class Node {

        final int VALUE;
        Node prev, next;

        Node(final int I) {
            VALUE = I;
        }

    }

    private static final int EMPTY_VALUE = -1;
    private Node last;
    int i;

    public void push(final int I) {

        if (last == null)
            last = new Node(I);
        else {
            last.next = new Node(I);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {

        if (isEmpty())
            return EMPTY_VALUE;
        return last.VALUE;
    }

    public int pop() {

        if (isEmpty())
            return EMPTY_VALUE;
        final int ret = last.VALUE;
        last = last.prev;
        return ret;
    }

}
