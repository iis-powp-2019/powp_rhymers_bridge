package edu.kis.vh.nursery.collection;

/**
 * Class storing array implementation of linked list
 */
public class IntLinkedList implements IntCollection {

    private class Node {

        final int VALUE;
        Node prev, next;


        Node(int i) {
            VALUE = i;
        }

    }

    private int elementCount = NUMBERS_EMPTY;
    private Node last;

    @Override
    public void push(int i) {

        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
        elementCount++;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {

        if (isEmpty())
            return EMPTY_VALUE;
        return last.VALUE;
    }

    @Override
    public int pop() {

        if (isEmpty())
            return EMPTY_VALUE;
        final int ret = last.VALUE;
        last = last.prev;
        elementCount--;
        return ret;
    }

    @Override
    public int getElementCount() {
        return elementCount;
    }
}
