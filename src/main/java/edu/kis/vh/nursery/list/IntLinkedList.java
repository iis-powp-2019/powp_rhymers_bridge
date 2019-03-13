package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_REPRESENTATION = -1;
    private Node last;
    private int i;

    public void push(int i) {
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

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_REPRESENTATION;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    Node getLast() {
        return last;
    }

    void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }
}
