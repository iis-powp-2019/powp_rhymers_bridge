package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int NO_ANY_ELEMENTS = -1;
    private Node last;

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
