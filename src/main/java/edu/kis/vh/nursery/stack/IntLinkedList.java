package edu.kis.vh.nursery.stack;

/**
 * @author Dominik Class implementing int doulby linked list
 */
public class IntLinkedList implements Stack {

    /**
     * reference to last node in the list
     */
    private Node last;
    private int total =Stack.EMPTY_STACK_VALUE;

    /**
     * adds new Node to the list
     *
     * @param i
     *            int value assigned to Node
     */
    @Override
    public int getTotal() {
        return total;
    }

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
     * @return true if list is empty, otherwise false
     */
    @Override
    public boolean callCheck() {
        return last == null;
    }

    /**
     * @return true if list is full, otherwise false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * @return value of the node lastly added to list
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return Stack.EMPTY_STACK_VALUE;
        }
        return last.getValue();
    }

    /**
     * removes lastly added node from the list
     *
     * @return value of the node lastly added to list
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return Stack.EMPTY_STACK_VALUE;
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
