package edu.kis.vh.nursery.collections;

import java.util.Collections;

public class IntLinkedList implements IntCollection {

    private Node last;
    private int i = IntCollection.STACK_STARTING_POSITION+1;

    /**
     *
     * @param i
     * Add i to linkedList
     */
    @Override
    public void push(int i) {
        if (last == null){
            last = new Node(i);
            this.i++;
            }
        else {
            this.i++;
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks that collections is empty
     * @return
     * True if last == null
     * false if last !=null
     */
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks that collections is full
     * @return
     * Always return false :)
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     *
     * @return
     * last value from linkedList
     * if linkedList is empty return -1
     */
    @Override
    public int top() {
        if (isEmpty())
            return IntCollection.STACK_VALUE_ON_STARTING_POSITION;
        return last.value;
    }

    /**
     *
     * @return
     * Last added value from linkedList and delete this value form collections
     */
    @Override
    public int pop() {
        if (isEmpty())
            return IntCollection.STACK_VALUE_ON_STARTING_POSITION;
        int ret = last.value;
        last = last.prev;
        this.i--;
        return ret;
    }

    @Override
    public int getElementCount() {
        return i;
    }

    public int getTotal(){
        return this.i;
    }

}
