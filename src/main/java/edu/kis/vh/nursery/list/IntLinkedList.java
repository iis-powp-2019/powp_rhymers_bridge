package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;
    private static final int EMPTY = -1;

    public static int getEMPTY() {
        return EMPTY;
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
            return getEMPTY();
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return getEMPTY();
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
