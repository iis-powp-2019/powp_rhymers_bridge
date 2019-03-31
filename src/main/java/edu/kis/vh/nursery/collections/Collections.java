package edu.kis.vh.nursery.collections;

public interface Collections {

    /**
     * Add new element to stack and increase index of stack last element
     *
     * @param in
     *            value added to stack
     */

    /**
     * Index indicating that stack has no elements
     */
    public static final int COLLECTION_EMPTY_INDEX = 0;

    void countIn(int in);

    /**
     * @return true if stack is empty
     */
    boolean callCheck();

    /**
     * @return true if stack is full, check the overflow
     */
    boolean isFull();

    /**
     * @return -1 if stack is empty or value in stack last element index
     */
    int peekaboo();

    /**
     * @return -1 if stack is empty or value in last element index of collector and decrease last element index by 1
     */
    int countOut();

    /**
     * @return last element index of stack
     */
    int getTotal();

}
