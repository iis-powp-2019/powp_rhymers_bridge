package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    /**
     *
     * @param i
     * Add i to linkedList
     */
    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks that list is empty
     * @return
     * True if last == null
     * false if last !=null
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks that list is full
     * @return
     * Always return false :)
     */
    private boolean isFull() {
        return false;
    }

    /**
     *
     * @return
     * last value from linkedList
     * if linkedList is empty return -1
     */
    private int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     *
     * @return
     * Last added value from linkedList and delete this value form list
     */
    private int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
