package edu.kis.vh.nursery.stackable;


/**
 * The type Int linked stackable.
 */
public class IntLinkedList implements IntStackableInterface {



    private Node last;
    private int countNode = INITIAL_STACK_INDEX;


    @Override
    public void countIn(final int i) {
        if (last == null) {
            last = new Node(i);
            countNode++;
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean callCheck() {
        return last == null;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Top int.
     *
     * @return the int
     */
    public int top() {
        if (callCheck())
            return RETURN_VALUE;
        return last.value;
    }

    /**
     * Pop int.
     *
     * @return the int
     */
    @Override
    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        int ret = last.value;
        last = last.prev;
        countNode--;
        return ret;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return last.value;
    }

    @Override
    public int getTotal() {
        return countNode;
    }

    /**
     * Gets last.
     *
     * @return the last
     */
    public Node getLast() {
        return last;
    }

    private class Node {

        /**
         * The Value.
         */
        final int value;
        /**
         * The Prev.
         */
        Node prev;
        /**
         * The Next.
         */
        Node next;

        /**
         * Instantiates a new Node.
         *
         * @param i the
         */
        Node(final int i) {
            value = i;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public int getValue() {
            return value;
        }

        /**
         * Gets prev.
         *
         * @return the prev
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Gets next.
         *
         * @return the next
         */
        public Node getNext() {
            return next;
        }

    }


}
