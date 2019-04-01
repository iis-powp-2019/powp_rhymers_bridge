package edu.kis.vh.nursery.stack.list;


import edu.kis.vh.nursery.stack.IntStack;

/**
 * @param
 * @author Admin
 */
public class IntLinkedList implements IntStack {

    Node last;

    int total = EMPTY_INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(int i) {
        total++;
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
    public boolean callCheck() {
        return last == null;
    }

    /**
     * @return
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return
     */
    public int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return last.getValue();
    }

    /**
     * @return
     */
    public int countOut() {
        total--;
        if (callCheck())
            return EMPTY_INDEX;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
