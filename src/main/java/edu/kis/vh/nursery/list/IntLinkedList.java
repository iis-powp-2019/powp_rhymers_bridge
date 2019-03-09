package edu.kis.vh.nursery.list;


/**
 * @author Admin
 * @param
 */
public class IntLinkedList {

    Node last;
    int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * @return
     */
    private boolean isFull() {
        return false;
    }

    /**
     * @return
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * @return
     */
    private int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
