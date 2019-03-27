package edu.kis.vh.nursery.list;

/**
 * IntLinkedList Class
 */
public class IntLinkedList {

    Node last;
    int i;

    /**
     * add value to list
     * @param i - value
     */
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
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * checking if list is full
     * @return return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * last value
     * @return return last value or if list is empty return -1;
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * delete last value
     * @return return last value or if list is empty return -1;
     */
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
