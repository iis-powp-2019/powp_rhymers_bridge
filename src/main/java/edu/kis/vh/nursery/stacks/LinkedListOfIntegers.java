package edu.kis.vh.nursery.stacks;

import edu.kis.vh.nursery.Stack;

public class LinkedListOfIntegers implements Stack {

    private static final int EMPTY_STACK_VALUE = -1;
    private Node last;
    private int i;

    @Override public void countIn(int in) {
        if (last == null) {
            last = new Node(in);
        }
        else {
            last.next = new Node(in);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override public boolean isFull() {
        return false;
    }

    @Override public boolean callCheck() {
        return last == null;
    }

    @Override public int actualNumber() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }

        return last.value;
    }

    @Override public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }

        int ret = last.value;
        last = last.prev;
        return ret;
    }
}

class Node {
    int value;
    Node prev, next;

    Node(final int i) {
        value = i;
    }
}
