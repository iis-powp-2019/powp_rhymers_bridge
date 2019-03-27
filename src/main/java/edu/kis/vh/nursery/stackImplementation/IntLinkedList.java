package edu.kis.vh.nursery.stackImplementation;

/**
 * IntLinkedList Class
 */
public class IntLinkedList implements Stack {

    Node last;
    int i;

    /**
     * add value to list
     * @param i - value
     */
    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * checking if list is empty
     * @return if list is empty return true else return false
     */
    @Override
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * checking if list is full
     * @return return false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * last value
     * @return return last value or if list is empty return -1;
     */
    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * delete last value
     * @return return last value or if list is empty return -1;
     */
    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * getter
     * @return i
     */
    public int getI() {
        return i;
    }


}
