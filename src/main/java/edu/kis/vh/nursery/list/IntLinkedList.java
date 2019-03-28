package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stack;

/**
 * Class implementing linked list
 */
public class IntLinkedList implements Stack {

    /**
     * Empty list indicator
     */
    private static final int EMPTY = 0;
    /**
     * Last node reference
     */
    private Node last;

    private int total = EMPTY;

    @Override
    public int getTotal() {
        return total;
    }

    /**
     * Adds new element to list, creates new node
     *
     * @param i
     *            value to put on list
     */
    @Override
    public void countIn(final int i) {
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
     * Check if list is empty
     *
     * @return true if list empty, else false
     */
    @Override
    public boolean callCheck() {
        return last == null;
    }

    /**
     * Check if list is full
     *
     * @return true if list full, else false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Returns value of last pushed value
     *
     * @return value of last pushed value
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY;
        }
        return last.getValue();
    }

    /**
     * Removes last pushed value
     *
     * @return value of last pushed value
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Class representing node of list
     *
     */
    private class Node {

        /**
         * Value stored in node
         */
        private final int value;
        /**
         * Reference to previous value
         */
        private Node prev;
        /**
         * Reference to next value
         */
        private Node next;

        /**
         * Class constructor
         *
         * @param i
         *            value to be stored in node
         */
        protected Node(final int i) {
            value = i;
        }

        /**
         * Returns value assigned to node
         *
         * @return value of node
         */
        public int getValue() {
            return value;
        }

        /**
         * @return reference to previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets reference to previous node
         *
         * @param prev
         *            previous node to be set
         */
        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        /**
         * @return reference to next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets reference to next node
         *
         * @param next
         *            next node to be set
         */
        public void setNext(final Node next) {
            this.next = next;
        }

    }
}
