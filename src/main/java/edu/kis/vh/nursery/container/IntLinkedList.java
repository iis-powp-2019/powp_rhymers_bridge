package edu.kis.vh.nursery.container;

import edu.kis.vh.nursery.StackInterface;

public class IntLinkedList implements StackInterface {

    private Node last;
    private int i;

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


    public void countIn(int in) { push(in); }


    public boolean callCheck() { return isEmpty(); }


    public int countOut() { return pop(); }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i;
    }
}
