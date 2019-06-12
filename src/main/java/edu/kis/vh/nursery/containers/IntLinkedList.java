package edu.kis.vh.nursery.containers;

import static edu.kis.vh.nursery.containers.Node.DEFAULT_INDEX;

public class IntLinkedList implements Stack {


    private Node last;
    private int i;
    private int total = 0;

    private int test;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
        total++;
    }


    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_INDEX;

        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_INDEX;

        int ret = last.getValue();
        last = last.getPrev();

        total--;
        return ret;
    }

    public int getTest() {
        return test;
    }

    public int getTotal(){
        return total;
    }
}
