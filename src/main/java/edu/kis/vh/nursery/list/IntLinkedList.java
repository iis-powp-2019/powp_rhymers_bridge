package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    private void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    private boolean isEmpty() {
        return getLast() == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return EMPTY;
        return getLast().getValue();
    }

    private int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(final Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }


}
