package edu.kis.vh.nursery.list;

/**
 * @author Dominik Class implementing int doulby linked list
 */
public class IntLinkedList {

    /**
     * Constant int field holding value of index in list when list is empty
     */
    private static final int EMPTY_LIST_VALUE = 0;
    /**
     * reference to last node in the list
     */
    private Node last;
    private int total = EMPTY_LIST_VALUE;

    /**
     * adds new Node to the list
     *
     * @param i
     *            int value assigned to Node
     */
    public int getTotal() {
        return total;
    }

    public void push(final int i) {
        total++;
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext()
                .setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return true if list is empty, otherwise false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return true if list is full, otherwise false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return value of the node lastly added to list
     */
    public int top() {
        if (isEmpty()) {
            return EMPTY_LIST_VALUE;
        }
        return last.getValue();
    }

    /**
     * removes lastly added node from the list
     *
     * @return value of the node lastly added to list
     */
    public int pop() {
        if (isEmpty()) {
            return EMPTY_LIST_VALUE;
        }
        int ret = last.getValue();
        last = last.getPrev();
        total--;
        return ret;
    }

    /**
     * Class implemnting Node used in list
     */
    private class Node {

        /**
         * value holded by the node
         */
        private final int value;
        /**
         * reference to the next node in the list
         */
        private Node prev;
        /**
         * reference to the previous node in the list
         */
        private Node next;

        /**
         * constructor of the Node
         *
         * @param i
         *            value assigned to the Node
         */
        public Node(final int i) {
            value = i;
        }

        /**
         * @return value assigned to the Node
         */
        public int getValue() {
            return value;
        }

        /**
         * @return reference to previous Node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * assigns reference to previous Node
         *
         * @param prev
         *            reference to previous Node
         */
        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        /**
         * @return reference to next Node
         */
        public Node getNext() {
            return next;
        }

        /**
         * assigns reference to next Node
         *
         * @param prev
         *            reference to next Node
         */
        public void setNext(final Node next) {
            this.next = next;
        }

    }

}
